package entity;

import java.sql.Date;

public class SearchParameter {
	private String from_city;
	private String to_city;
	private Date start_date;
	public SearchParameter(String from_city, String to_city, Date start_date) {
		super();
		this.from_city = from_city;
		this.to_city = to_city;
		this.start_date = start_date;
	}
	public SearchParameter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFrom_city() {
		return from_city;
	}
	public void setFrom_city(String from_city) {
		this.from_city = from_city;
	}
	public String getTo_city() {
		return to_city;
	}
	public void setTo_city(String to_city) {
		this.to_city = to_city;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	@Override
	public String toString() {
		return "SearchParameter [from_city=" + from_city + ", to_city=" + to_city + ", start_date=" + start_date + "]";
	}
	
}
