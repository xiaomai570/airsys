package dao.prototype;

import java.util.List;

import entity.Flight;
import entity.FlightAll;

public interface IFlightDao {
	FlightAll find(String flight_number);
	List<Flight> findall(int pageNo,int pageSize);
	void delete(String flight_number);
	void update(Flight flight);
	void insert(Flight flight);
}
