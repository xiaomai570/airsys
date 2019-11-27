package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.prototype.ISalesDao;
import entity.FlightScheduler;
import entity.Sales;

@Repository
public class SalesDaoImpl implements ISalesDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Sales find(int id) {
		Object[] val = {id};
		//-- sql  参数   转化规则
		return jdbcTemplate.queryForObject("select * from sales where id = ?",val, new BeanPropertyRowMapper<>(Sales.class));
		//return (Account)jdbcTemplate.queryForObject("select * from account where id = ?",val, new BeanPropertyRowMapper<Account>(Account.class));
	}
	@Override
	public List<Sales> findall(int offset, int pageSize) {
		return jdbcTemplate.query("select * from sales limit ?,?", new Object[] {offset,pageSize},new BeanPropertyRowMapper<Sales>(Sales.class));
	}
	@Override
	public void delete(int id) {
		jdbcTemplate.update("delete from sales where id = ?", new Object[] {id});
	}
	@Override
	public void update(Sales sales) {
		jdbcTemplate.update("update sales set job_id=?,s_name=?,s_number=?,s_password=?,branch_id=? where id = ?",
				new Object[]{sales.getJob_id(),sales.getS_name(),sales.getS_number(),sales.getS_password(),sales.getBranch_id(),sales.getId()});
	}
	@Override
	public List<Sales> findsome(String branch_id) {
		return jdbcTemplate.query("select * from sales where branch_id=?", new Object[] {branch_id},new BeanPropertyRowMapper<Sales>(Sales.class));
	}
	@Override
	public Sales search(String name, String password) {
		return jdbcTemplate.queryForObject("select * from sales where name = ?,password = ?",new Object[] {name,password}, new BeanPropertyRowMapper<>(Sales.class));
	}

}
