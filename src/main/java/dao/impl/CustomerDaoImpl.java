package dao.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.prototype.ICustomerDao;
import entity.Customer;
import entity.Flight;
import entity.TicketOrder;

@Repository
public class CustomerDaoImpl implements ICustomerDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Customer find(int id) {
		Object[] val = {id};
		//-- sql  参数   转化规则
		return jdbcTemplate.queryForObject("select * from customer where id = ?",val, new BeanPropertyRowMapper<>(Customer.class));
		//return (Account)jdbcTemplate.queryForObject("select * from account where id = ?",val, new BeanPropertyRowMapper<Account>(Account.class));
	}
	@Override
	public List<Customer> findall(int offset, int pageSize) {
		return jdbcTemplate.query("select * from customer limit ?,?", new Object[] {offset,pageSize},new BeanPropertyRowMapper<Customer>(Customer.class));
	}
	@Override
	public void delete(int id) {
		jdbcTemplate.update("delete from customer where id = ?", new Object[] {id});
	}
	@Override
	public void update(Customer customer) {
		jdbcTemplate.update("update customer set c_name=?,c_number=?,c_password=?,sex=?,age=?,id_card=? where id = ?",
				new Object[]{customer.getC_name(),customer.getC_number(),customer.getC_password(),customer.getSex(),customer.getAge(),customer.getId_card(),customer.getId()});
	}
	
	
	
}
