package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.prototype.IBranchDao;
import entity.Branch;
import entity.Flight;
import entity.FlightScheduler;
import entity.FlightScheduler1;
import entity.Sales;
import entity.TicketOrder;
import service.propotype.IBranchService;

@Service
public class BranchServiceImpl implements IBranchService{
	@Autowired
	private IBranchDao branchdao;
	
	@Override
	public Branch searchBranch(int id) {
		return null;
	}
	@Override
	public List<Branch> listBranch(int pageNo, int pageSize) {
		return branchdao.findall((pageNo-1)*pageSize, pageSize);
	}
	@Override
	public void deleteBranch(int id) {
		//System.out.println("success");
		branchdao.delete(id);
	}
	@Override
	public void updateBranch(Branch branch) {
		branchdao.update(branch);
	}
	@Override
	public void insertBranch(Branch branch) {
		branchdao.insert(branch);
	}
	@Override
	public Branch searchBranch(String name, String password) {
		return branchdao.search(name, password);
	}
	
	
	@Override
	public boolean branchlogin(String name, String password,String branchId) {
		boolean flag1 = false;
		try {
			branchdao.branchlogin(name,password,branchId);
			flag1 = true;
		} catch (Exception e) {}
		return flag1;
	}
	
	@Override
	public List<Sales> salesInformation(String branchId) {
		List<Sales> sales = branchdao.SalesInformation(branchId);
		return sales;
	}

	@Override
	public Sales sale(int id) {
		Sales sale = null;
		try {
			sale = branchdao.Sale(id);
			return sale;
		} catch (Exception e) {}
		
		return sale;
	}

	@Override
	public boolean saledelete(int id) {
		int delete = branchdao.Saledelete(id);
		if(delete==1) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void saleupdate(Sales sale) {
		branchdao.Saleupdate(sale);
	}

	@Override
	public void saleinsert(Sales sale) {
		branchdao.Saleinsert(sale);
	}

	@Override
	public List<FlightScheduler> flightSchedulerQuery() {
		List<FlightScheduler> fs = branchdao.flightSchedulerQuery();
		return fs;
	}

	@Override
	public Flight fightQuery(int id) {
		return branchdao.flightQuery(id);
	}

	@Override
	public List<TicketOrder> ticketQuery(String branchid) {
		return branchdao.ticketquery(branchid);
	}

	@Override
	public List<Branch> branchQuery() {
		return branchdao.branchQuery();
	}

	@Override
	public List<TicketOrder> ticketMonth(int year, int month) {
		return branchdao.ticketmouth(year, month);
	}
	@Override
	public List<FlightScheduler1> saleFight(String saleid) {
		return branchdao.saleFight(saleid);
	}
}
