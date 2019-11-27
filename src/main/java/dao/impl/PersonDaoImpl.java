package dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.prototype.PersonDao;
import entity.sales.Branch;
import entity.sales.Branch1;
import entity.sales.Flight1;
import entity.sales.FlightScheduler;
import entity.sales.Sales;
import entity.sales.Sales1;
import entity.sales.SearchFlight;
import entity.sales.TicketOrder;


@Repository
public class PersonDaoImpl implements PersonDao {

	@Autowired
	private DataSource ds;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public String[] findPerson(String sNumber) {	
		String[] count=new String[6];
		
		try {
			
			 Connection con=ds.getConnection();
			 Statement stmt=con.createStatement();
			
			 String sql="SELECT  * FROM sales t1 LEFT JOIN  branch t2 ON t1.branch_id=t2.branch_id WHERE s_number='"+sNumber+"';";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				
				count[0]=rs.getString("s_number");
				count[1]=rs.getString("s_password");
				count[2]=rs.getString("job_id");
				count[3]=rs.getString("s_name");
				count[4]=rs.getString("branch_id");
				count[5]=rs.getString("address");
			}
			     
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		return count;
		
	}

	@Override
	public boolean updatePasswordDao(String user, String password) {
		

		 Connection con=null;
		 Statement stmt=null;
		 int result=0;
		try {
			con = ds.getConnection();
			  stmt=con.createStatement();
			String sql="update sales SET s_password='"+password+"' where s_number='"+user+"';";
		     result=stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			if(result>0) {
				return true;
			}else {
				return false;
			}
			
	}

	@Override
	public List<FlightScheduler> getFlight1() {
	
	       return jdbcTemplate.query(
	    		   "select * from flight_scheduler", 
					 new BeanPropertyRowMapper<FlightScheduler>(FlightScheduler.class));
		}

	@Override
	public List<TicketOrder> getTicketOrder(String jobId) {
		  return jdbcTemplate.query(
	    		   "select * from ticket_order where sales_id ='"+jobId+"'", 
					 new BeanPropertyRowMapper<TicketOrder>(TicketOrder.class));
	}

	@Override
	public String getJobId(String sNumber) {
		return jdbcTemplate.queryForObject(
	    		   "select job_id from sales where s_number ='"+sNumber+"'", 
					String.class );
	}

	@Override
	public String[] findPerson1(String sNumber) {
               String[] count=new String[4];
		
		try {
			
			 Connection con=ds.getConnection();
			 Statement stmt=con.createStatement();
			
			 String sql="select * from boss where boss_number='"+sNumber+"';";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				count[0]=rs.getString("boss_number");
				count[1]=rs.getString("boss_password");
				count[2]=rs.getString("b_name");
				count[3]=rs.getString("id");
				
			}
			     
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		return count;
		
	}

	@Override
	public boolean updatePasswordDao1(String user, String password1) {
		// TODO Auto-generated method stub
		 Connection con=null;
		 Statement stmt=null;
		 int result=0;
		try {
			con = ds.getConnection();
			  stmt=con.createStatement();
			String sql="update boss SET boss_password='"+password1+"' where boss_number='"+user+"';";
		     result=stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			if(result>0) {
				return true;
			}else {
				return false;
			}
			
	}

	@Override
	public List<SearchFlight> getFlight2() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(
				" SELECT * FROM  flight t2 LEFT JOIN flight_scheduler t1 ON  t2.flight_number=t1.flight_number ",
				
				 new BeanPropertyRowMapper<SearchFlight>(SearchFlight.class)		          
				);
	}

	@Override
	public List<Branch1> getBranch() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(
				"select * from branch ",
				new BeanPropertyRowMapper<Branch1>(Branch1.class));
	}

	@Override
	public Integer getCount(String branchId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(
				"select count(*) from ticket_order where branch_id=?;",
				new Object[]{branchId},
				Integer.class);
	}

	@Override
	public List<Sales1> getSales1(String branchId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(
				"select * from sales where branch_id=? ",
				new Object[] {branchId},
				new BeanPropertyRowMapper<Sales1>(Sales1.class));
	}

	@Override
	public Integer getCount1(String jobId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(
				"select count(*) from ticket_order where sales_id=?;",
				new Object[]{jobId},
				Integer.class);
	}

}
