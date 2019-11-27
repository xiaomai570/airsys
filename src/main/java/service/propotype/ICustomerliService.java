package service.propotype;


import java.sql.Date;
import java.util.List;

import entity.Customer;
import entity.Customerli;
import entity.Flightli;
import entity.TicketOrder;

public interface ICustomerliService {
	
	public int register(Customerli cusli);
	public Customerli login(String c_number,String c_password);
	public int modify(Customerli cus);
	public List<Flightli> searchFlight(String from_city,String to_city,Date start_date);
	public List<TicketOrder> seeOrder(String card);
	public List<Flightli> gaiqian1(String id,java.util.Date date1);
	public String queryDate(String flight_number);
	
}
