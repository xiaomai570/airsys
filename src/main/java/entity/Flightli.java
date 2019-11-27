package entity;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component("Flightli")
public class Flightli {
	private String flight_number;
	private String from_city;
	private String to_city;
	private Timestamp departure_time;
	private Timestamp arrival_time;
	private String start_airplane;
	private String end_airplane;
	private int first_class_remain_seats;
	private int business_class_remain_seats;
	private int economy_class_remain_seats;
	private int first_price;
	private int business_price;
	private int economy_price;
	public Flightli() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flightli(String flight_number, String from_city, String to_city, Timestamp departure_time,
			Timestamp arrival_time, String start_airplane, String end_airplane, int first_class_remain_seats,
			int business_class_remain_seats, int economy_class_remain_seats, int first_price, int business_price,
			int economy_price) {
		super();
		this.flight_number = flight_number;
		this.from_city = from_city;
		this.to_city = to_city;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.start_airplane = start_airplane;
		this.end_airplane = end_airplane;
		this.first_class_remain_seats = first_class_remain_seats;
		this.business_class_remain_seats = business_class_remain_seats;
		this.economy_class_remain_seats = economy_class_remain_seats;
		this.first_price = first_price;
		this.business_price = business_price;
		this.economy_price = economy_price;
	}
	public String getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
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
	public Timestamp getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(Timestamp departure_time) {
		this.departure_time = departure_time;
	}
	public Timestamp getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(Timestamp arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getStart_airplane() {
		return start_airplane;
	}
	public void setStart_airplane(String start_airplane) {
		this.start_airplane = start_airplane;
	}
	public String getEnd_airplane() {
		return end_airplane;
	}
	public void setEnd_airplane(String end_airplane) {
		this.end_airplane = end_airplane;
	}
	public int getFirst_class_remain_seats() {
		return first_class_remain_seats;
	}
	public void setFirst_class_remain_seats(int first_class_remain_seats) {
		this.first_class_remain_seats = first_class_remain_seats;
	}
	public int getBusiness_class_remain_seats() {
		return business_class_remain_seats;
	}
	public void setBusiness_class_remain_seats(int business_class_remain_seats) {
		this.business_class_remain_seats = business_class_remain_seats;
	}
	public int getEconomy_class_remain_seats() {
		return economy_class_remain_seats;
	}
	public void setEconomy_class_remain_seats(int economy_class_remain_seats) {
		this.economy_class_remain_seats = economy_class_remain_seats;
	}
	public int getFirst_price() {
		return first_price;
	}
	public void setFirst_price(int first_price) {
		this.first_price = first_price;
	}
	public int getBusiness_price() {
		return business_price;
	}
	public void setBusiness_price(int business_price) {
		this.business_price = business_price;
	}
	public int getEconomy_price() {
		return economy_price;
	}
	public void setEconomy_price(int economy_price) {
		this.economy_price = economy_price;
	}
	@Override
	public String toString() {
		return "Flightli [flight_number=" + flight_number + ", from_city=" + from_city + ", to_city=" + to_city
				+ ", departure_time=" + departure_time + ", arrival_time=" + arrival_time + ", start_airplane="
				+ start_airplane + ", end_airplane=" + end_airplane + ", first_class_remain_seats="
				+ first_class_remain_seats + ", business_class_remain_seats=" + business_class_remain_seats
				+ ", economy_class_remain_seats=" + economy_class_remain_seats + ", first_price=" + first_price
				+ ", business_price=" + business_price + ", economy_price=" + economy_price + "]";
	}
	
}