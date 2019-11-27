package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.prototype.LoginDao;
import entity.sales.Boss;
import entity.sales.Sales;
import service.propotype.LoginService;


@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginDao logindao;
    
	@Override
	public boolean valid(String user, String password) {
		List<Sales> sales=logindao.find();
		System.out.println(sales);
		for(Sales sale:sales) {
			System.out.println(sale);
             if(user.equals(sale.getsNumber())&&password.equals(sale.getsPassword())) {
            	 return true;
             }
		}
		return false;
		
	
	}

	@Override
	public String getName(String user) {
	
		Sales sale=logindao.find1(user);
		String name=sale.getsName();
		return name;
	}

	@Override
	public boolean valid1(String user, String password) {
		// TODO Auto-generated method stub
		List<Boss> boss1=logindao.find1();
		System.out.println(boss1);
		for(Boss boss:boss1) {
			System.out.println(boss);
             if(user.equals(boss.getBossNumber())&&password.equals(boss.getBossPassword())) {
            	 return true;
             }
		}
		return false;
		
	}

	@Override
	public String getName1(String user) {
		// TODO Auto-generated method stub

		Boss boss=logindao.find2(user);
		String name=boss.getbName();
		return name;
	}

	

}
