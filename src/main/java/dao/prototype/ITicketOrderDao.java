package dao.prototype;

import java.util.List;

import entity.TicketOrder;

public interface ITicketOrderDao {
	TicketOrder find(int id);
	List<TicketOrder> findall(int pageNo,int pageSize);
	void delete(int id);
	void update(TicketOrder ticketorder);
}
