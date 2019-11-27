package service.propotype;

import java.util.List;

import entity.Boss;

public interface IBossService {
	Boss searchBoss(int id);
	List<Boss> listBoss(int pageNo,int pageSize);
	void deleteBoss(int id);
	void updateBoss(Boss boss);
	void insertBoss(Boss boss);
	Boss searchBoss(String name,String password);
}
