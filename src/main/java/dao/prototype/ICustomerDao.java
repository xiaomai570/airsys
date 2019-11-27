package dao.prototype;

import java.sql.Date;
import java.util.List;

import entity.Customer;
import entity.Flight;
import entity.TicketOrder;

public interface ICustomerDao {
	Customer find(int id);
	List<Customer> findall(int pageNo,int pageSize);
	void delete(int id);
	void update(Customer customer);
	
}
