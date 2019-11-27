package dao.impl;

import java.sql.Date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.prototype.ICustomerliDao;
import entity.Customerli;
import entity.Flightli;
import entity.TicketOrder;

@Repository("CustomerliDaoImpl")
public class CustomerliDaoImpl implements ICustomerliDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int saveOrUpdate(Customerli cus) {
		int result = 0;
		if(cus.getId()==0) {
			result = jdbcTemplate.update("insert into customer(c_name,c_number,c_password,sex,age,id_card,phone) values(?,?,?,?,?,?,?)", 
					new Object[] {cus.getC_name(),cus.getC_number(),cus.getC_password(),cus.getSex(),cus.getAge(),cus.getId_card(),cus.getPhone()});
		}else {
			result = jdbcTemplate.update("update customer set c_number=?,c_password=?,phone=? where id=?",new Object[] {cus.getC_number(),cus.getC_password(),cus.getPhone(),cus.getId()});
		}
		return result;
	}

	@Override
	public Customerli find(String c_number, String c_password) {
		Customerli cus = jdbcTemplate.queryForObject("select * from customer where c_number=? and c_password=?", new Object[] {c_number,c_password},
				new BeanPropertyRowMapper<>(Customerli.class));
		return cus;
	}

	@Override
	public List<Flightli> searchFlightli(String from_city, String to_city, Date start_date) {
		return jdbcTemplate.query("select s.flight_number,s.from_city,s.to_city,s.departure_time,s.arrival_time,s.start_airplane,s.end_airplane,f.first_class_remain_seats,f.economy_class_remain_seats,f.business_class_remain_seats,f.first_price,f.business_price,f.economy_price from flight f join flight_scheduler s on f.flight_number=s.flight_number where s.from_city=? and s.to_city=? and s.start_date=?", 
							new Object[] {from_city,to_city,start_date},
							new BeanPropertyRowMapper<>(Flightli.class));
	}

	@Override
	public List<TicketOrder> seeOrder(String card) {
		List<TicketOrder> order = jdbcTemplate.query("select * from ticket_order where certification_number=?", 
				new Object[]{card},
				new BeanPropertyRowMapper<TicketOrder>(TicketOrder.class));
		return order;
		
	}

	@Override
	public List<Flightli> gaiqian1(String id,java.util.Date date) {
		return jdbcTemplate.query("select b.*,d.first_class_remain_seats,d.business_class_remain_seats,d.economy_class_remain_seats,d.first_price,d.business_price,d.economy_price from (select f.* from flight_scheduler f join (select from_city,to_city from flight_scheduler where flight_number=?) a "
				+ "on f.from_city=a.from_city and f.to_city=a.to_city and f.start_date != ?) b join flight d on b.flight_number=d.flight_number", 
				new Object[] {id,date},
				new BeanPropertyRowMapper<>(Flightli.class));
	}

	@Override
	public String queryDate(String flight_number) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(
				"select start_date from flight_scheduler where flight_number=?",
				new Object[] {flight_number},
				String.class);
	}
	
}