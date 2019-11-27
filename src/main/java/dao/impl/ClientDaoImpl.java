package dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import dao.prototype.ClientDao;
import entity.sales.Branch;
import entity.sales.Customer;
import entity.sales.Customer1;
import entity.sales.Sales;
import entity.sales.SearchFlight;
import entity.sales.TicketOrder;
@Repository
public class ClientDaoImpl implements ClientDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public List<Customer> getCustomer() {
	       
	     return jdbcTemplate.query(
	    		 "select * from customer",
	    		 new BeanPropertyRowMapper<Customer>(Customer.class));
	}
	
	@Override
	public List<SearchFlight> getSearchFlight(String fromCity, String toCity, Date date) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(
				" SELECT * FROM  flight t2 LEFT JOIN flight_scheduler t1 ON  t2.flight_number=t1.flight_number WHERE t1.from_city=? AND t1.to_city=? AND t1.start_date=?",
				 new Object[] {fromCity,toCity,date},
				 new BeanPropertyRowMapper<SearchFlight>(SearchFlight.class)		          
				);
	}
	@Override
	public List<SearchFlight> getSearchFlight(String flightNumber) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(
				" SELECT * FROM  flight t2 LEFT JOIN flight_scheduler t1 ON  t2.flight_number=t1.flight_number WHERE t1.flight_number=?",
				 new Object[] {flightNumber},
				 new BeanPropertyRowMapper<SearchFlight>(SearchFlight.class)		          
				);
	}
	public SearchFlight getSearchFlight1(String flightNumber) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(
				" SELECT * FROM  flight t2 LEFT JOIN flight_scheduler t1 ON  t2.flight_number=t1.flight_number WHERE t1.flight_number=?",
				 new Object[] {flightNumber},
				 new BeanPropertyRowMapper<SearchFlight>(SearchFlight.class)		          
				);
	}
	@Override
	public Customer getPassengerName(String idCard) {
		
		     return  jdbcTemplate.queryForObject(
		    		 "select * from customer where id_card=?",
		    		 new Object[] {idCard},
		    		 new BeanPropertyRowMapper<Customer>(Customer.class)
		    		 );
	}
	@Override
	public Sales getBranch(String salesId) {
		// TODO Auto-generated method stub
		  return  jdbcTemplate.queryForObject(
		    		 "select * from sales where job_id=?",
		    		 new Object[] {salesId},
		    		 new BeanPropertyRowMapper<Sales>(Sales.class)
		    		 );
	}
	@Override
	public int insertTicketOrder(String flightNumber, String passengerName, String idCard, String grade,
			String branchId, String salesId) {
		return jdbcTemplate.update(
				"insert into ticket_order(flight_number,passenger_name,certification_number,order_date,grade,branch_id,sales_id)values(?,?,?,?,?,?,?)",
				new Object[] {flightNumber,passengerName,idCard,"2019-11-12",grade,branchId,salesId}
				);
		
	}
	@Override
	public int updateFlight(String flightNumber,int remainSeat2) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(
				"update flight set first_class_remain_seats=? where flight_number=?",
				new Object[] {remainSeat2,flightNumber}
				);
	}
	@Override
	public int updateFlight1(String flightNumber,int remainSeat2) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(
				"update flight set business_class_remain_seats=? where flight_number=?",
				new Object[] {remainSeat2,flightNumber}
				);
	}
	@Override
	public int updateFlight2(String flightNumber,int remainSeat2) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(
				"update flight set economy_class_remain_seats=? where flight_number=? ",
				new Object[] {remainSeat2,flightNumber}
				);
	}
	@Override
	public String getJobId(String sNmber) {
		
		return jdbcTemplate.queryForObject(
				"select job_id from sales where s_number=?",
				new Object[] {sNmber},
				String.class);
	}

	@Override
	public List<Customer1> getCustomer1() {
		  
	     return jdbcTemplate.query(
	    		 "select * from customer",
	    		 new BeanPropertyRowMapper<Customer1>(Customer1.class));
	}

	@Override
	public List<TicketOrder> SearchOrderId(String IdCard) {
		// TODO Auto-generated method stub
		return  jdbcTemplate.query(
				"select * from ticket_order where certification_number =?",
				new Object[] {IdCard},
				new BeanPropertyRowMapper<TicketOrder>(TicketOrder.class)
				);
	}

	@Override
	public String getGrade(String flightNumber, String idCard) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(
				"select grade from ticket_order where flight_number=? and certification_number=?",
				new Object[] {flightNumber,idCard},
				String.class
				);
	}

	@Override
	public int delectOrder(String flightNumber, String idCard) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(
				"delete from ticket_order where flight_number=? and certification_number=?",
				new Object[] {flightNumber,idCard});
	}

	@Override
	public int updateTicket(String flightNumber, String idCard, String flightNumber1, String grade1) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(
				"update ticket_order set flight_number=?,grade=? where flight_number=? and certification_number=?",
				new Object[] {flightNumber1,grade1,flightNumber,idCard}
				);
	}
	
	
	

}
