package service.propotype;

import java.util.List;

import entity.Branch;
import entity.Flight;
import entity.FlightScheduler;
import entity.FlightScheduler1;
import entity.Sales;
import entity.TicketOrder;

public interface IBranchService {
	Branch searchBranch(int id);
	List<Branch> listBranch(int pageNo,int pageSize);
	void deleteBranch(int id);
	void updateBranch(Branch branch);
	void insertBranch(Branch branch);
	Branch searchBranch(String name,String password);
	
	
	//   钀ヤ笟缃戠偣鐧诲綍
	public boolean branchlogin(String name,String password,String branchId);
	//   钀ヤ笟鐐归�夋嫨
	public List<Branch> branchQuery();
	//   鍞エ鍛樹俊鎭煡鐪�
	public List<Sales> salesInformation(String branchId);
	//   鍞エ鍛樹釜浜轰俊鎭煡璇�
	public Sales sale(int id);
	//   鍞エ鍛樹釜浜轰俊鎭垹闄�
	public boolean saledelete(int id);
	//   鍞エ鍛樹釜浜轰俊鎭慨鏀�
	public void saleupdate(Sales sale);
	//   鍞エ鍛樹俊鎭坊鍔�
	public void saleinsert(Sales sale);
	//   鑸彮鍩烘湰淇℃伅鏌ヨ
	public List<FlightScheduler> flightSchedulerQuery();
	//   鑸彮鍏蜂綋淇℃伅
	public Flight fightQuery(int id);
	//   缃戠偣鏈虹エ鏌ョ湅
	public List<TicketOrder> ticketQuery(String branchid);
	//   缃戠偣鏌愭湀鏈虹エ鍞崠鏌ヨ
	public List<TicketOrder> ticketMonth(int year,int month);
	
	public List<FlightScheduler1> saleFight(String saleid);
}
