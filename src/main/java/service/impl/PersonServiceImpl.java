package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.prototype.PersonDao;
import entity.sales.Branch;
import entity.sales.Branch1;
import entity.sales.FlightScheduler;
import entity.sales.Sales1;
import entity.sales.SearchFlight;
import entity.sales.TicketOrder;
import service.propotype.PersonService;



@Service
public class PersonServiceImpl implements PersonService {

	  @Autowired
	  private PersonDao personDao;
	@Override
	public String[] personInform(String sNumber) {
		
		return personDao.findPerson(sNumber);
		
		
	}
	@Override
	public boolean updatePassword(String user,String password) {
		
		  
		return personDao.updatePasswordDao( user, password);
	}
	@Override
	public List<FlightScheduler> getFlight1() {
		// TODO Auto-generated method stub
		return personDao.getFlight1();

}
	@Override
	public List<TicketOrder> getTicketOrder(String jobId) {
		return personDao.getTicketOrder(jobId);
	}
	@Override
	public String getJobId(String sNumber) {
		// TODO Auto-generated method stub
		return personDao.getJobId(sNumber);
	}
	@Override
	public String[] personInform1(String sNumber) {
		// TODO Auto-generated method stub
		return personDao.findPerson1(sNumber);
	}
	@Override
	public boolean updatePassword1(String user, String password1) {
		// TODO Auto-generated method stub
		return personDao.updatePasswordDao1( user, password1);
	}
	@Override
	public List<SearchFlight> getFlight2() {
		// TODO Auto-generated method stub
		return personDao.getFlight2();
	}
	@Override
	public List<Branch1> getBranch() {
		// TODO Auto-generated method stub
		return personDao.getBranch();
	}
	@Override
	public String getCount(String branchId) {
		// TODO Auto-generated method stub
		return personDao.getCount(branchId).toString();
		
	}
	@Override
	public List<Sales1> getSales1(String branchId) {
		// TODO Auto-generated method stub
		return personDao.getSales1(branchId);
	}
	@Override
	public String getCount1(String jobId) {
		// TODO Auto-generated method stub
		return personDao.getCount1(jobId).toString();
	}
}
