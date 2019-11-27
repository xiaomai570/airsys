package entity.sales;

import java.util.Date;

public class FlightScheduler {
	
      private int id;
      private String flightNumber;
      private Date startDate;
      private Date endDate;
      private String fromCity;
      private String toCity;
      private Date departureTime;
      private Date arrivalTime;
      private String startAirplane;
      private String endAirplane;
	public FlightScheduler() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightScheduler(int id, String flightNumber, Date startDate, Date endDate, String fromCity, String toCity,
			Date departureTime, Date arrivalTime, String startAirplane, String endAirplane) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.startAirplane = startAirplane;
		this.endAirplane = endAirplane;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getFromCity() {
		return fromCity;
	}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}
	public String getToCity() {
		return toCity;
	}
	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getStartAirplane() {
		return startAirplane;
	}
	public void setStartAirplane(String startAirplane) {
		this.startAirplane = startAirplane;
	}
	public String getEndAirplane() {
		return endAirplane;
	}
	public void setEndAirplane(String endAirplane) {
		this.endAirplane = endAirplane;
	}
	@Override
	public String toString() {
		return "FlightScheduler [id=" + id + ", flightNumber=" + flightNumber + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", fromCity=" + fromCity + ", toCity=" + toCity + ", departureTime="
				+ departureTime + ", arrivalTime=" + arrivalTime + ", startAirplane=" + startAirplane + ", endAirplane="
				+ endAirplane + "]";
	}
}