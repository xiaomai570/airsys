package service.propotype;

import java.util.Date;
import java.util.List;

import entity.sales.Customer;
import entity.sales.Customer1;
import entity.sales.SearchFlight;
import entity.sales.TicketOrder;

public interface ClientService {
	  List<Customer> getCustomer();  
	  List<SearchFlight> getSearchFlight(String fromCity,String toCity,Date date);
	   List<SearchFlight> getSearchFlight(String flightNumber);
	   boolean insertOrder(String flightNumber,String grade,String idCard,String salesId);
	   String  getJobId(String sNmber);
	   SearchFlight getSearchFlight1(String flightNumber);
	   List<Customer1> getCustomer1();
	      List<TicketOrder> SearchOrderId(String IdCard);
		boolean TuiOrder(String flightNumber, String idCard);
		boolean updateTicket(String flightNumber, String grade, String idCard, String flightNumber1, String grade1);
}
