package dao.prototype;

import java.util.List;

import entity.Boss;

public interface IBossDao {
	Boss find(int id);
	List<Boss> findall(int pageNo,int pageSize);
	void delete(int id);
	void update(Boss boss);
	void insert(Boss boss);
	Boss search(String name,String password);
}
