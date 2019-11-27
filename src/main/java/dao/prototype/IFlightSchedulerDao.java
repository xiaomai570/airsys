package dao.prototype;

import java.util.List;

import entity.FlightScheduler;

public interface IFlightSchedulerDao {
	FlightScheduler find(int id);
	List<FlightScheduler> findall(int pageNo,int pageSize);
	void delete(String flight_number);
	void update(FlightScheduler flightschduler);
	void insert(FlightScheduler flightschduler);
}
