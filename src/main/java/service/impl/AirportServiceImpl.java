package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.prototype.IAirportDao;
import entity.Airport;
import service.propotype.IAirportService;

@Service
public class AirportServiceImpl implements IAirportService{
	@Autowired
	private IAirportDao airportdao;
	
	@Override
	public Airport searchAirport(int id) {
		return null;
	}
	@Override
	public List<Airport> listAirport(int pageNo, int pageSize) {
		return airportdao.findall((pageNo-1)*pageSize, pageSize);
	}
	@Override
	public void deleteAirport(int id) {
		//System.out.println("success");
		airportdao.delete(id);
	}
	@Override
	public void updateAirport(Airport airport) {
		airportdao.update(airport);
	}
	@Override
	public void insertAirport(Airport airport) {
		airportdao.insert(airport);
	}
}
