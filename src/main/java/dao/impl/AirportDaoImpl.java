package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.prototype.IAirportDao;
import entity.Airport;
import entity.Boss;

@Repository
public class AirportDaoImpl implements IAirportDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Airport find(int id) {
		Object[] val = {id};
		//-- sql  参数   转化规则
		return jdbcTemplate.queryForObject("select * from airport where id = ?",val, new BeanPropertyRowMapper<>(Airport.class));
		//return (Account)jdbcTemplate.queryForObject("select * from account where id = ?",val, new BeanPropertyRowMapper<Account>(Account.class));
	}
	@Override
	public List<Airport> findall(int offset, int pageSize) {
		return jdbcTemplate.query("select * from airport limit ?,?",
				new Object[] {offset,pageSize},new BeanPropertyRowMapper<Airport>(Airport.class));
	}
	@Override
	public void delete(int id) {
		jdbcTemplate.update("delete from airport where id = ?", new Object[] {id});
	}
	@Override
	public void update(Airport airport) {
		jdbcTemplate.update("update airport set airport_code=?,city=?,airport_name=? where id = ?", 
				new Object[] {airport.getAirport_code(),airport.getCity(),airport.getAirport_name(),airport.getId()});
	}
	@Override
	public void insert(Airport airport) {
		jdbcTemplate.update("insert into airport(airport_code,city,airport_name) values(?,?,?)", 
				new Object[] {airport.getAirport_code(),airport.getCity(),airport.getAirport_name()});
	}

}
