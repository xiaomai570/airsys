package service.propotype;

import java.util.List;

import entity.FlightScheduler;

public interface IFlightSchedulerService {
	FlightScheduler searchFlightScheduler(int id);
	List<FlightScheduler> listFlightScheduler(int pageNo,int pageSize);
	void deleteFlightScheduler(String flight_number);
	void updateFlightScheduler(FlightScheduler flightscheduler);
	void insertFlightScheduler(FlightScheduler flightscheduler);
}
