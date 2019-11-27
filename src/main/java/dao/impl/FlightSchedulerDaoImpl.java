package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.prototype.IFlightSchedulerDao;
import entity.FlightScheduler;

@Repository
public class FlightSchedulerDaoImpl implements IFlightSchedulerDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public FlightScheduler find(int id) {
		Object[] val = {id};
		//-- sql  参数   转化规则
		return jdbcTemplate.queryForObject("select * from flight_scheduler where id = ?",val, new BeanPropertyRowMapper<>(FlightScheduler.class));
		//return (Account)jdbcTemplate.queryForObject("select * from account where id = ?",val, new BeanPropertyRowMapper<Account>(Account.class));
	}
	@Override
	public List<FlightScheduler> findall(int offset, int pageSize) {
		return jdbcTemplate.query("select * from flight_scheduler limit ?,?", new Object[] {offset,pageSize},new BeanPropertyRowMapper<FlightScheduler>(FlightScheduler.class));
	}
	@Override
	public void delete(String flight_number) {
		jdbcTemplate.update("delete from flight_scheduler where flight_number = ?", new Object[] {flight_number});
	}
	@Override
	public void update(FlightScheduler flightscheduler) {
		jdbcTemplate.update("update flight_scheduler set flight_number=?,start_date=?,end_date=?,from_city=?,to_city=?,departure_time=?,arrival_time=?,start_airplane=?,end_airplane=? where id = ?",
				new Object[]{flightscheduler.getFlight_number(),flightscheduler.getStart_date(),flightscheduler.getEnd_date(),flightscheduler.getFrom_city(),flightscheduler.getTo_city(),flightscheduler.getDeparture_time(),flightscheduler.getArrival_time(),flightscheduler.getStart_airplane(),flightscheduler.getEnd_airplane(),flightscheduler.getId()});
	}
	@Override
	public void insert(FlightScheduler flightscheduler) {
		jdbcTemplate.update("insert into flight_scheduler(flight_number,start_date,end_date,from_city,to_city,departure_time,arrival_time,start_airplane,end_airplane) values(?,?,?,?,?,?,?,?,?)",
				new Object[]{flightscheduler.getFlight_number(),flightscheduler.getStart_date(),flightscheduler.getEnd_date(),flightscheduler.getFrom_city(),flightscheduler.getTo_city(),flightscheduler.getDeparture_time(),flightscheduler.getArrival_time(),flightscheduler.getStart_airplane(),flightscheduler.getEnd_airplane()});
	}

}
