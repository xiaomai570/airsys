package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.prototype.ITicketOrderDao;
import entity.Sales;
import entity.TicketOrder;
import service.propotype.ITicketOrderService;

@Service
public class TicketOrderServiceImpl implements ITicketOrderService{
	@Autowired
	private ITicketOrderDao ticketorderdao;
	
	@Override
	public TicketOrder searchTicketOrder(int id) {
		return null;
	}
	@Override
	public List<TicketOrder> listTicketOrder(int pageNo, int pageSize) {
		return ticketorderdao.findall((pageNo-1)*pageSize, pageSize);
	}
	@Override
	public void deleteTicketOrder(int id) {
		//System.out.println("success");
		ticketorderdao.delete(id);
	}
	@Override
	public void updateTicketOrder(TicketOrder ticketorder) {
		ticketorderdao.update(ticketorder);
	}
}
