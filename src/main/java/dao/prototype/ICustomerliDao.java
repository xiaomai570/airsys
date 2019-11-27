package dao.prototype;

import java.sql.Date;
import java.util.List;

import entity.Customerli;
import entity.Flightli;
import entity.TicketOrder;

public interface ICustomerliDao {
	
	public int saveOrUpdate(Customerli cus);
	public Customerli find(String c_number,String c_password);
	public List<Flightli> searchFlightli(String from_city,String to_city,Date start_date);
	public List<TicketOrder> seeOrder(String card);
	public List<Flightli> gaiqian1(String id,java.util.Date date);
	public String queryDate(String flight_number);
}
