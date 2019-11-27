package dao.prototype;

import java.util.List;

import entity.Sales;

public interface ISalesDao {
	Sales find(int id);
	List<Sales> findall(int pageNo,int pageSize);
	List<Sales> findsome(String branch_id);
	void delete(int id);
	void update(Sales sales);
	Sales search(String name,String password);
}
