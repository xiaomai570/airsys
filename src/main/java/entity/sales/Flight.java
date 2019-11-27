package entity.sales;

import java.util.Date;

public class Flight {
      private int id;
      private String flightNumber;
      private Date departureDate;
      private int firstClassSeats;
      private int businessClassSeats;
      private int economyClassSeats;
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(int id, String flightNumber, Date departureDate, int firstClassSeats, int businessClassSeats,
			int economyClassSeats) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.departureDate = departureDate;
		this.firstClassSeats = firstClassSeats;
		this.businessClassSeats = businessClassSeats;
		this.economyClassSeats = economyClassSeats;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public int getFirstClassSeats() {
		return firstClassSeats;
	}
	public void setFirstClassSeats(int firstClassSeats) {
		this.firstClassSeats = firstClassSeats;
	}
	public int getBusinessClassSeats() {
		return businessClassSeats;
	}
	public void setBusinessClassSeats(int businessClassSeats) {
		this.businessClassSeats = businessClassSeats;
	}
	public int getEconomyClassSeats() {
		return economyClassSeats;
	}
	public void setEconomyClassSeats(int economyClassSeats) {
		this.economyClassSeats = economyClassSeats;
	}
	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightNumber=" + flightNumber + ", departureDate=" + departureDate
				+ ", firstClassSeats=" + firstClassSeats + ", businessClassSeats=" + businessClassSeats
				+ ", economyClassSeats=" + economyClassSeats + "]";
	}
      
      
      
}
