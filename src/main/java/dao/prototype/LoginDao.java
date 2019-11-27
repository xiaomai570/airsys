package dao.prototype;

import java.util.List;

import entity.sales.Boss;
import entity.sales.Sales;

public interface LoginDao {
       List<Sales> find();

	Sales find1(String user);

	List<Boss> find1();
	
	Boss find2(String user);
}
