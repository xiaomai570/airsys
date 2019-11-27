package entity.sales;

import java.util.Date;

public class Flight1 {
       
       private String flightNumber;
       private String fromCity;
       private String toCity;
       private Date startDate;
       private Date endDate;
       private String startAirplane;
       private String endAirplane;
	public Flight1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight1( String flightNumber, String fromCity, String toCity, Date startDate, Date endDate,
			String startAirplane, String endAirplane) {
		super();
	
		this.flightNumber = flightNumber;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startAirplane = startAirplane;
		this.endAirplane = endAirplane;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
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
		return "Flight1 [ flightNumber=" + flightNumber + ", fromCity=" + fromCity + ", toCity=" + toCity
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", startAirplane=" + startAirplane
				+ ", endAirplane=" + endAirplane + "]";
	}
  
       
}
