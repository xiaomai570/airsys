package dao.prototype;

import java.util.List;

import entity.sales.Branch;
import entity.sales.Branch1;
import entity.sales.Flight1;
import entity.sales.FlightScheduler;
import entity.sales.Sales1;
import entity.sales.SearchFlight;
import entity.sales.TicketOrder;

public interface PersonDao {
      String[] findPerson(String sNumber);

	boolean updatePasswordDao(String user, String password);
	
	List<FlightScheduler>getFlight1();
	List<TicketOrder>getTicketOrder(String jobId);
	String getJobId(String sNumber);

	String[] findPerson1(String sNumber);

	boolean updatePasswordDao1(String user, String password1);

	List<SearchFlight> getFlight2();

	List<Branch1> getBranch();

	Integer getCount(String branchId);

	List<Sales1> getSales1(String branchId);

	Integer getCount1(String jobId);
}
