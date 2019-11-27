package service.propotype;

import java.util.List;

import entity.TicketOrder;

public interface ITicketOrderService {
	TicketOrder searchTicketOrder(int id);
	List<TicketOrder> listTicketOrder(int pageNo,int pageSize);
	void deleteTicketOrder(int id);
	void updateTicketOrder(TicketOrder ticketorder);
}
