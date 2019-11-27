package service.propotype;

import java.util.List;

import entity.sales.Branch;
import entity.sales.Branch1;
import entity.sales.FlightScheduler;
import entity.sales.Sales1;
import entity.sales.SearchFlight;
import entity.sales.TicketOrder;

public interface PersonService {
         String[] personInform(String sNumber);
         boolean updatePassword(String user,String password);
         List<FlightScheduler> getFlight1();
         List<TicketOrder> getTicketOrder(String jobId);
         String getJobId(String sNumber);
		String[] personInform1(String sNumber);
		boolean updatePassword1(String user, String password1);
		List<SearchFlight> getFlight2();
		List<Branch1> getBranch();
		String getCount(String branchId);
		List<Sales1> getSales1(String branchId);
		String getCount1(String jobId);
}
