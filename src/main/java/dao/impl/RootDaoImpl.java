package dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.prototype.IRootDao;
import entity.Root;

@Repository
public class RootDaoImpl implements IRootDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Root search(String root_number, String root_password) {
		return jdbcTemplate.queryForObject("select * from root where root_number=? and root_password=?", new Object[] {root_number,root_password},new BeanPropertyRowMapper<>(Root.class));
	}
	
}
