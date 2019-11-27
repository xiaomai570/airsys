package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.prototype.IFlightDao;
import entity.Flight;
import entity.FlightAll;

@Repository
public class FlightDaoImpl implements IFlightDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public FlightAll find(String flight_number) {
		Object[] val = {flight_number};
		//-- sql  参数   转化规则
		return jdbcTemplate.queryForObject("select f1.id,f1.flight_number,f1.first_class_remain_seats,f1.business_class_remain_seats,f1.economy_class_remain_seats," + 
				"f1.first_price,f1.business_price,f1.economy_price,f2.start_date,f2.end_date,f2.from_city,f2.to_city," + 
				"f2.departure_time,f2.arrival_time,f2.start_airplane,f2.end_airplane from flight f1 left outer join flight_scheduler f2 on f1.flight_number=f2.flight_number where f1.flight_number = ?",val, new BeanPropertyRowMapper<>(FlightAll.class));
		//return (Account)jdbcTemplate.queryForObject("select * from account where id = ?",val, new BeanPropertyRowMapper<Account>(Account.class));
	}
	@Override
	public List<Flight> findall(int offset, int pageSize) {
		return jdbcTemplate.query("select * from flight limit ?,?", new Object[] {offset,pageSize},new BeanPropertyRowMapper<Flight>(Flight.class));
	}
	@Override
	public void delete(String flight_number) {
		jdbcTemplate.update("delete from flight where flight_number = ?", new Object[] {flight_number});
	}
	@Override
	public void update(Flight flight) {
		jdbcTemplate.update("update flight set flight_number=?,first_class_remain_seats=?,business_class_remain_seats=?,economy_class_remain_seats=?,first_price=?,business_price=?,economy_price=? where id = ?",
				new Object[]{flight.getFlight_number(),flight.getFirst_class_remain_seats(),flight.getBusiness_class_remain_seats(),flight.getEconomy_class_remain_seats(),flight.getFirst_price(),flight.getBusiness_price(),flight.getEconomy_price(),flight.getId()});
	}
	@Override
	public void insert(Flight flight) {
		jdbcTemplate.update("insert into flight(flight_number,first_class_remain_seats,business_class_remain_seats,economy_class_remain_seats,first_price,business_price,economy_price) value(?,?,?,?,?,?,?)",
				new Object[]{flight.getFlight_number(),flight.getFirst_class_remain_seats(),flight.getBusiness_class_remain_seats(),flight.getEconomy_class_remain_seats(),flight.getFirst_price(),flight.getBusiness_price(),flight.getEconomy_price()});
	}

}
