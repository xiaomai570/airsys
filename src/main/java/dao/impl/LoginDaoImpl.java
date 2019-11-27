package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.prototype.LoginDao;
import entity.sales.Boss;
import entity.sales.Sales;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Sales> find() {
		
		return jdbcTemplate.query(
				"select * from sales ", 
				 new BeanPropertyRowMapper<Sales>(Sales.class));
	}
	@Override
	public Sales find1(String user) {
		
		return  jdbcTemplate.queryForObject(
				"select * from sales where s_number=?",
				new Object[]{user},
				new BeanPropertyRowMapper<Sales>(Sales.class)
				
				);
	}
	@Override
	public List<Boss> find1() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(
				"select * from boss ", 
				 new BeanPropertyRowMapper<Boss>(Boss.class));
	}
	@Override
	public Boss find2(String user) {
		// TODO Auto-generated method stub

		return  jdbcTemplate.queryForObject(
				"select * from boss where boss_number=?",
				new Object[]{user},
				new BeanPropertyRowMapper<Boss>(Boss.class)
				
				);
	}
	
	
        
}
