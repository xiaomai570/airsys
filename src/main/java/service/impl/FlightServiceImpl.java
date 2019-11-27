package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.prototype.IFlightDao;
import entity.Flight;
import entity.FlightAll;
import service.propotype.IFlightService;

@Service
public class FlightServiceImpl implements IFlightService{
	@Autowired
	private IFlightDao flightdao;
	
	@Override
	public FlightAll searchFlight(String flight_number) {
		return flightdao.find(flight_number);
	}
	@Override
	public List<Flight> listFlight(int pageNo, int pageSize) {
		return flightdao.findall((pageNo-1)*pageSize, pageSize);
	}
	@Override
	public void deleteFlight(String flight_number) {
		//System.out.println("success");
		flightdao.delete(flight_number);
	}
	@Override
	public void updateFlight(Flight flight) {
		flightdao.update(flight);
	}
	@Override
	public void insertFlight(Flight flight) {
		flightdao.insert(flight);
	}
}
