package entity;

import java.util.Date;

public class Gaiqian1 {
	private String flight_number;
	private Date start_date;
	public Gaiqian1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gaiqian1(String flight_number, Date start_date) {
		super();
		this.flight_number = flight_number;
		this.start_date = start_date;
	}
	
	public String getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	@Override
	public String toString() {
		return "Gaiqian1 [flight_number=" + flight_number + ", start_date=" + start_date + "]";
	}
	
	
}