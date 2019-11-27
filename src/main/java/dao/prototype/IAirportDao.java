package dao.prototype;

import java.util.List;

import entity.Airport;

public interface IAirportDao {
	Airport find(int id);
	List<Airport> findall(int pageNo,int pageSize);
	void delete(int id);
	void update(Airport airport);
	void insert(Airport airport);
}
