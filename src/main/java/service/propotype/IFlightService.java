package service.propotype;

import java.util.List;

import entity.Flight;
import entity.FlightAll;

public interface IFlightService {
	FlightAll searchFlight(String flight_number);
	List<Flight> listFlight(int pageNo,int pageSize);
	void deleteFlight(String flight_number);
	void updateFlight(Flight flight);
	void insertFlight(Flight flight);
}
