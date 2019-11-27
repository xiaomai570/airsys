package service.propotype;

import java.util.List;

import entity.Customer;

public interface ICustomerService {
	Customer searchCustomer(int id);
	List<Customer> listCustomer(int pageNo,int pageSize);
	void deleteCustomer(int id);
	void updateCustomer(Customer customer);
}
