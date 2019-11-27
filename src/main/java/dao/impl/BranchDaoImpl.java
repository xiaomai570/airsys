package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.prototype.IBranchDao;
import entity.Branch;
import entity.Flight;
import entity.FlightScheduler;
import entity.FlightScheduler1;
import entity.Sales;
import entity.TicketOrder;

@Repository
public class BranchDaoImpl implements IBranchDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Branch find(int id) {
		Object[] val = {id};
		//-- sql  参数   转化规则
		return jdbcTemplate.queryForObject("select * from branch where id = ?",val, new BeanPropertyRowMapper<>(Branch.class));
		//return (Account)jdbcTemplate.queryForObject("select * from account where id = ?",val, new BeanPropertyRowMapper<Account>(Account.class));
	}
	@Override
	public List<Branch> findall(int offset, int pageSize) {
		return jdbcTemplate.query("select * from branch limit ?,?", new Object[] {offset,pageSize},new BeanPropertyRowMapper<Branch>(Branch.class));
	}
	@Override
	public void delete(int id) {
		jdbcTemplate.update("delete from branch where id = ?", new Object[] {id});
	}
	@Override
	public void update(Branch branch) {
		jdbcTemplate.update("update branch set b_name=?,address=?,telephone=?,province=?,city=?,b_password=?,branch_id=? where id = ?", new Object[] {branch.getB_name(),branch.getAddress(),branch.getTelephone(),branch.getProvince(),branch.getCity(),branch.getB_password(),branch.getBranch_id(),branch.getId()});
	}
	@Override
	public void insert(Branch branch) {
		jdbcTemplate.update("insert into branch(b_name,address,telephone,province,city,b_password,branch_id) values(?,?,?,?,?,?,?)", new Object[] {branch.getB_name(),branch.getAddress(),branch.getTelephone(),branch.getProvince(),branch.getCity(),branch.getB_password(),branch.getBranch_id()});
	}
	@Override
	public Branch search(String name, String password) {
		return jdbcTemplate.queryForObject("select * from branch where b_name = ? and b_password = ?",new Object[] {name,password}, new BeanPropertyRowMapper<>(Branch.class));
	}
	
	@Override
	public Branch branchlogin(String name, String password,String branchId) throws Exception {
		return  jdbcTemplate.queryForObject("select * from branch where b_Name=? and b_Password=? and branch_id=?", 
				new Object[] {name,password,branchId},
				new BeanPropertyRowMapper<Branch>(Branch.class));
	}

	@Override
	public List<Branch> branchQuery() {
		return jdbcTemplate.query(
				"select branch_id from branch",
				new BeanPropertyRowMapper<Branch>(Branch.class));
	}
	
	@Override
	public List<Sales> SalesInformation(String branchId) {
		return  jdbcTemplate.query("select * from sales where branch_id=?", 
				new Object[] {branchId},
				new BeanPropertyRowMapper<Sales>(Sales.class));
	}

	@Override
	public Sales Sale(int id) {
		return jdbcTemplate.queryForObject("select * from sales where id=?",
				new Object[] {id},
				new BeanPropertyRowMapper<Sales>(Sales.class));
	}

	@Override
	public int Saledelete(int id) {
	    return jdbcTemplate.update("delete from sales where id="+id);
	   
	}

	@Override
	public int Saleupdate(Sales sale) {
	   return jdbcTemplate.update(
				"update sales set job_id=?,s_name=?,s_password=?,s_number=?,branch_id=? where id=?",
				new Object[] {sale.getJob_id(),sale.getS_name(),sale.getS_password(),sale.getS_number(),sale.getBranch_id(),sale.getId()});
	}

	@Override
	public int Saleinsert(Sales sale) {
		return jdbcTemplate.update(
				"insert into sales (job_id,s_name,s_password,s_number,branch_id) values (?,?,?,?,?)",
				new Object[] {sale.getJob_id(),sale.getS_name(),sale.getS_password(),sale.getS_number(),sale.getBranch_id()});
		
	}

	@Override
	public List<FlightScheduler> flightSchedulerQuery() {
		return jdbcTemplate.query(
				"select * from flight_scheduler", 
				new BeanPropertyRowMapper<FlightScheduler>(FlightScheduler.class));
	}

	@Override
	public Flight flightQuery(int id) {
		return jdbcTemplate.queryForObject(
				"select * from flight where id=?",
				new Object[] {id},
				new BeanPropertyRowMapper<Flight>(Flight.class));
	}

	@Override
	public List<TicketOrder> ticketquery(String branchid) {
		return jdbcTemplate.query(
			"select * from ticket_order where branch_id=?",
			new Object[] {branchid},
			new BeanPropertyRowMapper<TicketOrder>(TicketOrder.class)
		);
	}

	@Override
	public List<TicketOrder> ticketmouth(int year,int month) {
		return jdbcTemplate.query(
			"select * from ticket_order where year(order_date)=? and month(order_date)=?",
			new Object[] {year,month},
			new BeanPropertyRowMapper<TicketOrder>(TicketOrder.class)
		);
	}
	@Override
	public List<FlightScheduler1> saleFight(String saleid) {
		return jdbcTemplate.query(
				"select flight_number,count(*) total from ticket_order where sales_id = ? group by flight_number",
				new Object[] {saleid},
				new BeanPropertyRowMapper<FlightScheduler1>(FlightScheduler1.class)
				);
	}

}
