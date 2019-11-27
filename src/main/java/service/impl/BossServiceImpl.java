package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.prototype.IBossDao;
import entity.Boss;
import service.propotype.IBossService;

@Service
public class BossServiceImpl implements IBossService{
	@Autowired
	private IBossDao bossdao;
	
	@Override
	public Boss searchBoss(int id) {
		return null;
	}
	@Override
	public List<Boss> listBoss(int pageNo, int pageSize) {
		return bossdao.findall((pageNo-1)*pageSize, pageSize);
	}
	@Override
	public void deleteBoss(int id) {
		//System.out.println("success");
		bossdao.delete(id);
	}
	@Override
	public void updateBoss(Boss boss) {
		bossdao.update(boss);
	}
	@Override
	public void insertBoss(Boss boss) {
		bossdao.insert(boss);
	}
	@Override
	public Boss searchBoss(String name, String password) {
		return bossdao.search(name,password);
	}
}
