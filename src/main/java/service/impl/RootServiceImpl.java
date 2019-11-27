package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.prototype.IRootDao;
import entity.Root;
import service.propotype.IRootService;

@Service
public class RootServiceImpl implements IRootService{
	@Autowired
	private IRootDao rootdao;

	@Override
	public Root searchRoot(String root_number, String root_password) {
		return rootdao.search(root_number,root_password);
	}
	
}
