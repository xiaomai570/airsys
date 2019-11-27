package service.propotype;

import java.util.List;

import entity.Airport;

public interface IAirportService {
	Airport searchAirport(int id);
	List<Airport> listAirport(int pageNo,int pageSize);
	void deleteAirport(int id);
	void updateAirport(Airport airport);
	void insertAirport(Airport airport);
}
