package dao.prototype;

import java.util.Date;
import java.util.List;

import entity.sales.Branch;
import entity.sales.Customer;
import entity.sales.Customer1;
import entity.sales.Sales;
import entity.sales.SearchFlight;
import entity.sales.TicketOrder;

public interface ClientDao {
           List<Customer> getCustomer();    
           List<SearchFlight> getSearchFlight(String fromCity,String toCity,Date date);
           List<SearchFlight> getSearchFlight(String flightNumber);
	                Customer getPassengerName(String idCard);
	                 Sales getBranch(String salesId);
	      int insertTicketOrder(String flightNumber,String passengerName,String idCard,String grade,String branchId,String salesId);
	      int updateFlight( String flightNumber,int remainSeat2);
	      int updateFlight1(String flightNumber, int remainSeat2);
	      int updateFlight2(String flightNumber, int remainSeat2);
	          SearchFlight getSearchFlight1(String flightNumber);
	        String  getJobId(String sNmber);
	        List<Customer1> getCustomer1();
			List<TicketOrder> SearchOrderId(String IdCard);
			String getGrade(String flightNumber, String idCard);
			int delectOrder(String flightNumber, String idCard);
			int updateTicket(String flightNumber, String idCard, String flightNumber1, String grade1);
			String getPrice(String flightNumber, String grade1);    
}
