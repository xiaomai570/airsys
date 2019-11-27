package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.prototype.ICustomerDao;
import entity.Customer;
import service.propotype.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	private ICustomerDao customerdao;
	
	@Override
	public Customer searchCustomer(int id) {
		return null;
	}
	@Override
	public List<Customer> listCustomer(int pageNo, int pageSize) {
		return customerdao.findall((pageNo-1)*pageSize, pageSize);
	}
	@Override
	public void deleteCustomer(int id) {
		//System.out.println("success");
		customerdao.delete(id);
	}
	@Override
	public void updateCustomer(Customer customer) {
		customerdao.update(customer);
	}
	
	
}
