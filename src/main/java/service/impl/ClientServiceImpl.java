package service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.prototype.ClientDao;
import entity.sales.Customer;
import entity.sales.Customer1;
import entity.sales.Sales;
import entity.sales.SearchFlight;
import entity.sales.TicketOrder;
import service.propotype.ClientService;


@Service
public class ClientServiceImpl implements ClientService {
     
	@Autowired
	private ClientDao clientDao;
	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return clientDao.getCustomer();
	}
	@Override
	public List<SearchFlight> getSearchFlight(String fromCity, String toCity, Date date) {
		// TODO Auto-generated method stub
		return clientDao.getSearchFlight(fromCity, toCity, date);
	}
	@Override
	public List<SearchFlight> getSearchFlight(String flightNumber) {
		// TODO Auto-generated method stub
		return clientDao.getSearchFlight(flightNumber);
	}
	@Override
	@Transactional
	public boolean insertOrder(String flightNumber, String grade, String idCard, String salesId) {
		    int grade1=Integer.parseInt(grade);	    
		   Customer customer=clientDao.getPassengerName(idCard);
		     String passengerName=customer.getcName();
		     System.out.println(passengerName);
		      Sales sales=clientDao.getBranch(salesId);
		      String branchId=sales.getBranchId();
		      System.out.println(flightNumber);
		      System.out.println(passengerName);
		      System.out.println(idCard);		      
		      System.out.println(grade);
		      System.out.println(branchId);
		      System.out.println(salesId);
		     int result= clientDao.insertTicketOrder(flightNumber,passengerName,idCard,grade,branchId,salesId);
            
		     //		  	int i = 3; 
//			if(i==3) throw new RuntimeException("�������㣬���Ա��쳣");
		     SearchFlight searchflight = clientDao.getSearchFlight1(flightNumber);
		     int result1=0;
		     if(grade1==1) {
		    	 String remainSeat=searchflight.getFirstClassRemainSeats();
		    	 int remainSeat1=Integer.parseInt(remainSeat);
		    	 int remainSeat2=remainSeat1-1;
		    	 result1=clientDao.updateFlight(flightNumber,remainSeat2);		    	 
		     }else if(grade1==2){
		    	 String remainSeat=searchflight.getBusinessClassRemainSeats();
		    	 int remainSeat1=Integer.parseInt(remainSeat);
		    	 int remainSeat2=remainSeat1-1;
		    	result1= clientDao.updateFlight1(flightNumber,remainSeat2);	
		     }else {
		    	 String remainSeat=searchflight.getEconomyClassRemainSeats();
		    	 int remainSeat1=Integer.parseInt(remainSeat);
		    	 int remainSeat2=remainSeat1-1;
		    	 result1=clientDao.updateFlight2(flightNumber,remainSeat2);	
		     }
             if(result>0&&result1>0) {
            	 return true;
             }else {
            	 return false;
             }
	}
	@Override
	public String getJobId(String sNmber) {
		return clientDao.getJobId(sNmber);
	}
	@Override
	public SearchFlight getSearchFlight1(String flightNumber) {
		// TODO Auto-generated method stub
		return clientDao.getSearchFlight1(flightNumber);
	}
	@Override
	public List<Customer1> getCustomer1() {
		// TODO Auto-generated method stub
		return clientDao.getCustomer1();
	}
	@Override
	public List<TicketOrder> SearchOrderId(String IdCard) {
		// TODO Auto-generated method stub
		return  clientDao.SearchOrderId(IdCard);
	}
	@Override
	@Transactional
	public boolean TuiOrder(String flightNumber, String idCard) {
		// TODO Auto-generated method stub
		      String grade=clientDao.getGrade(flightNumber,idCard);
		      System.out.println(grade);
		      int grade1=Integer.parseInt(grade);	
		       int result= clientDao.delectOrder(flightNumber,idCard);
		       System.out.println(result);
		       SearchFlight searchflight = clientDao.getSearchFlight1(flightNumber);
		       int result1=0;
		       if(grade1==1) {
			    	 String remainSeat=searchflight.getFirstClassRemainSeats();
			    	 int remainSeat1=Integer.parseInt(remainSeat);
			    	 int remainSeat2=remainSeat1+1;
			    	 result1=clientDao.updateFlight(flightNumber,remainSeat2);		    	 
			     }else if(grade1==2){
			    	 String remainSeat=searchflight.getBusinessClassRemainSeats();
			    	 int remainSeat1=Integer.parseInt(remainSeat);
			    	 int remainSeat2=remainSeat1+1;
			    	result1= clientDao.updateFlight1(flightNumber,remainSeat2);	
			     }else {
			    	 String remainSeat=searchflight.getEconomyClassRemainSeats();
			    	 int remainSeat1=Integer.parseInt(remainSeat);
			    	 int remainSeat2=remainSeat1+1;
			    	 result1=clientDao.updateFlight2(flightNumber,remainSeat2);	
			     }
		       if(result>0&&result1>0) {
	            	 return true;
	             }else {
	            	 return false;
	             }
		       
	}
	@Override
	@Transactional
	public boolean updateTicket(String flightNumber, String grade, String idCard, String flightNumber1, String grade1) {
		  int gradeXian=Integer.parseInt(grade);
		  int gradeHou=Integer.parseInt(grade1);
		       int result=clientDao.updateTicket(flightNumber,idCard,flightNumber1,grade1);
		       int result1;
		       int result2;	    			    
			     if(gradeXian==1) {
			    	 SearchFlight searchflight = clientDao.getSearchFlight1(flightNumber);
			    	 String remainSeat=searchflight.getFirstClassRemainSeats();
			    	 int remainSeat1=Integer.parseInt(remainSeat);
			    	 System.out.println(remainSeat1);
			    	 int remainSeat2=remainSeat1+1;
			    	 System.out.println(remainSeat2);
			    	 result1=clientDao.updateFlight(flightNumber,remainSeat2);		    	 
			     }else if(gradeXian==2){
			    	 SearchFlight searchflight = clientDao.getSearchFlight1(flightNumber);
			    	 String remainSeat=searchflight.getBusinessClassRemainSeats();
			    	 int remainSeat1=Integer.parseInt(remainSeat);
			    	 int remainSeat2=remainSeat1+1;
			    	result1= clientDao.updateFlight1(flightNumber,remainSeat2);	
			     }else {
			    	 SearchFlight searchflight = clientDao.getSearchFlight1(flightNumber);
			    	 String remainSeat=searchflight.getEconomyClassRemainSeats();
			    	 int remainSeat1=Integer.parseInt(remainSeat);
			    	 int remainSeat2=remainSeat1+1;
			    	 result1=clientDao.updateFlight2(flightNumber,remainSeat2);	
			     }
			     if(gradeHou==1) {
			    	 SearchFlight searchflight = clientDao.getSearchFlight1(flightNumber1);
			    	 String remainSeat=searchflight.getFirstClassRemainSeats();
			    	 int remainSeat1=Integer.parseInt(remainSeat);
			    	 int remainSeat2=remainSeat1-1;
			    	 result2=clientDao.updateFlight(flightNumber1,remainSeat2);		    	 
			     }else if(gradeHou==2){
			    	 SearchFlight searchflight = clientDao.getSearchFlight1(flightNumber1);
			    	 String remainSeat=searchflight.getBusinessClassRemainSeats();
			    	 int remainSeat1=Integer.parseInt(remainSeat);
			    	 int remainSeat2=remainSeat1-1;
			    	result2= clientDao.updateFlight1(flightNumber1,remainSeat2);	
			     }else {
			    	 SearchFlight searchflight = clientDao.getSearchFlight1(flightNumber1);
			    	 String remainSeat=searchflight.getEconomyClassRemainSeats();
			    	 int remainSeat1=Integer.parseInt(remainSeat);
			    	 System.out.println(remainSeat1);
			    	 int remainSeat2=remainSeat1-1;
			    	 System.out.println(remainSeat2);
			    	 result2=clientDao.updateFlight2(flightNumber1,remainSeat2);	
			     }
			     System.out.println(result);
			     System.out.println(result1);
			     System.out.println(result2);
			     
			     if(result>0&&result1>0&&result2>0) {
	            	 return true;
	             }else {
	            	 return false;
	             }
			     
	             
	}
	@Override
	public String getPrice(String flightNumber, String grade1) {
		// TODO Auto-generated method stub
		return clientDao.getPrice(flightNumber,grade1);
	}
	
	
	
	
}
