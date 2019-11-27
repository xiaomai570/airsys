package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.prototype.ISalesDao;
import entity.Sales;
import service.propotype.ISalesService;

@Service
public class SalesServiceImpl implements ISalesService {
	@Autowired
	private ISalesDao salesdao;

	@Override
	public Sales searchSales(int id) {
		return null;
	}

	@Override
	public List<Sales> listSales(int pageNo, int pageSize) {
		return salesdao.findall((pageNo - 1) * pageSize, pageSize);
	}

	@Override
	public void deleteSales(int id) {
		//System.out.println("success");
		salesdao.delete(id);
	}

	@Override
	public void updateSales(Sales sales) {
		salesdao.update(sales);
	}

	@Override
	public List<Sales> listSale(String branch_id) {
		return salesdao.findsome(branch_id);
	}

	@Override
	public Sales searchSales(String name, String password) {
		return salesdao.search(name, password);
	}
}
