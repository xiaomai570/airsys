package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.prototype.IBossDao;
import entity.Boss;

@Repository
public class BossDaoImpl implements IBossDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Boss find(int id) {
		Object[] val = {id};
		//-- sql  参数   转化规则
		return jdbcTemplate.queryForObject("select * from boss where id = ?",val, new BeanPropertyRowMapper<>(Boss.class));
		//return (Account)jdbcTemplate.queryForObject("select * from account where id = ?",val, new BeanPropertyRowMapper<Account>(Account.class));
	}
	@Override
	public List<Boss> findall(int offset, int pageSize) {
		return jdbcTemplate.query("select * from boss limit ?,?", new Object[] {offset,pageSize},new BeanPropertyRowMapper<Boss>(Boss.class));
	}
	@Override
	public void delete(int id) {
		jdbcTemplate.update("delete from boss where id = ?", new Object[] {id});
	}
	@Override
	public void update(Boss boss) {
		jdbcTemplate.update("update boss set b_name=?,boss_number=?,boss_password=? where id = ?", new Object[] {boss.getB_name(),boss.getBoss_number(),boss.getBoss_password(),boss.getId()});
	}
	@Override
	public void insert(Boss boss) {
		jdbcTemplate.update("insert into boss(b_name,boss_number,boss_password) values(?,?,?)", new Object[] {boss.getB_name(),boss.getBoss_number(),boss.getBoss_password()});
	}
	@Override
	public Boss search(String name, String password) {
		return jdbcTemplate.queryForObject("select * from boss where boss_number = ? and boss_password = ?",new Object[] {name,password}, new BeanPropertyRowMapper<>(Boss.class));
	}

}
