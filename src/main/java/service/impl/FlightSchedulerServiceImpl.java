package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.prototype.IFlightSchedulerDao;
import entity.Flight;
import entity.FlightScheduler;
import service.propotype.IFlightSchedulerService;

@Service
public class FlightSchedulerServiceImpl implements IFlightSchedulerService{
	@Autowired
	private IFlightSchedulerDao flightschedulerdao;
	
	@Override
	public FlightScheduler searchFlightScheduler(int id) {
		return null;
	}
	@Override
	public List<FlightScheduler> listFlightScheduler(int pageNo, int pageSize) {
		return flightschedulerdao.findall((pageNo-1)*pageSize, pageSize);
	}
	@Override
	public void deleteFlightScheduler(String flight_number) {
		System.out.println("success");
		//flightdao.delete(flight_number);
	}
	@Override
	public void updateFlightScheduler(FlightScheduler flightscheduler) {
		flightschedulerdao.update(flightscheduler);
	}
	@Override
	public void insertFlightScheduler(FlightScheduler flightscheduler) {
		flightschedulerdao.insert(flightscheduler);
	}
}
