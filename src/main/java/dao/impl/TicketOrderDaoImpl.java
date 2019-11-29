package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.prototype.ITicketOrderDao;
import entity.Sales;
import entity.TicketOrder;

@Repository
public class TicketOrderDaoImpl implements ITicketOrderDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public TicketOrder find(int id) {
		Object[] val = {id};
		//-- sql  参数   转化规则
		return jdbcTemplate.queryForObject("select * from ticket_order where id = ?",val, new BeanPropertyRowMapper<>(TicketOrder.class));
		//return (Account)jdbcTemplate.queryForObject("select * from account where id = ?",val, new BeanPropertyRowMapper<Account>(Account.class));
	}
	@Override
	public List<TicketOrder> findall(int offset, int pageSize) {
		return jdbcTemplate.query("select * from ticket_order limit ?,?", new Object[] {offset,pageSize},new BeanPropertyRowMapper<TicketOrder>(TicketOrder.class));
	}
	@Override
	public void delete(int id) {
		jdbcTemplate.update("delete from ticket_order where id = ?", new Object[] {id});
	}
	@Override
	public void update(TicketOrder ticketorder) {
		jdbcTemplate.update("update ticket_order set flight_number=?,passenger_name=?,certification_number=?,order_date=?,grade=?,branch_id=?,sales_id=? where id = ?",
				new Object[]{ticketorder.getFlight_number(),ticketorder.getPassenger_name(),ticketorder.getCertification_number(),ticketorder.getOrder_date(),ticketorder.getGrade(),ticketorder.getBranch_id(),ticketorder.getSales_id(),ticketorder.getId()});
	}

}
