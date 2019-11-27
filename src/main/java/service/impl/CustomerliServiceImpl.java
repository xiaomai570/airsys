package service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.prototype.ICustomerliDao;
import entity.Customerli;
import entity.Flightli;
import entity.TicketOrder;
import service.propotype.ICustomerliService;

@Service
public class CustomerliServiceImpl implements ICustomerliService{
	@Autowired
	private ICustomerliDao customerdao;
	
	@Override
	public int register(Customerli cus) {
		int result = customerdao.saveOrUpdate(cus);
		return result;
	}

	@Override
	public Customerli login(String c_number, String c_password) {
		Customerli cus = null;
		try {
			cus = customerdao.find(c_number, c_password);
		} catch (Exception e) {
			e.printStackTrace();
		}
			return cus;
	}

	@Override
	public int modify(Customerli cus) {
		return customerdao.saveOrUpdate(cus);
	}

	@Override
	public List<Flightli> searchFlight(String from_city, String to_city, Date start_date) {
		return customerdao.searchFlightli(from_city, to_city, start_date);
	}

	@Override
	public List<TicketOrder> seeOrder(String card) {
		return customerdao.seeOrder(card);
	}

	@Override
	public List<Flightli> gaiqian1(String id,java.util.Date  date) {
		List<Flightli> list = customerdao.gaiqian1(id, date);
		return list;
	}

	@Override
	public String queryDate(String flight_number) {
		// TODO Auto-generated method stub
		return customerdao.queryDate(flight_number);
	}
}
