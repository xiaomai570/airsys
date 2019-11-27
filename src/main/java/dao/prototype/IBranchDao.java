package dao.prototype;

import java.util.List;

import entity.Branch;
import entity.Flight;
import entity.FlightScheduler;
import entity.FlightScheduler1;
import entity.Sales;
import entity.TicketOrder;

public interface IBranchDao {
	Branch find(int id);
	List<Branch> findall(int pageNo,int pageSize);
	void delete(int id);
	void update(Branch branch);
	void insert(Branch branch);
	Branch search(String name,String password);
	
	//  鐧诲綍鎺ュ彛
	public Branch branchlogin(String name,String password,String branchId) throws Exception;
	//  钀ヤ笟缃戝簵淇℃伅閬嶅巻
	public List<Branch> branchQuery();
	//  钀ヤ笟鍛樹俊鎭煡璇�
	public List<Sales> SalesInformation(String branchId);
	//  钀ヤ笟鍛樹釜浜轰俊鎭煡鐪�
	public Sales Sale(int id) throws Exception;
	//  钀ヤ笟鍛樹俊鎭垹闄�
	public int Saledelete(int id);
	//  钀ヤ笟鍛樹俊鎭慨鏀�
	public int Saleupdate(Sales sale);
	//  钀ヤ笟鍛樹俊鎭鍔�
	public int Saleinsert(Sales sale);
	//  鑸彮鍩烘湰淇℃伅
	public List<FlightScheduler> flightSchedulerQuery();
	//  鑸彮鍏蜂綋淇℃伅
	public Flight flightQuery(int id);
	//  钀ヤ笟鐐归攢鍞儏鍐�
	public List<TicketOrder> ticketquery(String branchid);
	//  钀ヤ笟鐐瑰綋鏈堥攢鍞儏鍐�
	public List<TicketOrder> ticketmouth(int year,int month);
	//  钀ヤ笟鍛樹釜浜哄敭绁ㄦ煡璇�
	public List<FlightScheduler1> saleFight(String saleid);
}
