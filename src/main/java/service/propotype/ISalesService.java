package service.propotype;

import java.util.List;

import entity.Sales;

public interface ISalesService {
	Sales searchSales(int id);
	List<Sales> listSales(int pageNo,int pageSize);
	List<Sales> listSale(String branch_id);
	void deleteSales(int id);
	void updateSales(Sales sales);
	Sales searchSales(String name,String password);
}
