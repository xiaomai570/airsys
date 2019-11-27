package entity;

public class FlightAll {
	private int id;
	private String flight_number;
	private int first_class_remain_seats;
	private int business_class_remain_seats;
	private int economy_class_remain_seats;
	private int first_price;
	private int business_price;
	private int economy_price;
	private String start_date;
	private String end_date;
	private String from_city;
	private String to_city;
	private String departure_time;
	private String arrival_time;
	private String start_airplane;
	private String end_airplane;
	public FlightAll() {
		super();
	}
	public FlightAll(int id, String flight_number, int first_class_remain_seats, int business_class_remain_seats,
			int economy_class_remain_seats, int first_price, int business_price, int economy_price, String start_date,
			String end_date, String from_city, String to_city, String departure_time, String arrival_time,
			String start_airplane, String end_airplane) {
		super();
		this.id = id;
		this.flight_number = flight_number;
		this.first_class_remain_seats = first_class_remain_seats;
		this.business_class_remain_seats = business_class_remain_seats;
		this.economy_class_remain_seats = economy_class_remain_seats;
		this.first_price = first_price;
		this.business_price = business_price;
		this.economy_price = economy_price;
		this.start_date = start_date;
		this.end_date = end_date;
		this.from_city = from_city;
		this.to_city = to_city;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.start_airplane = start_airplane;
		this.end_airplane = end_airplane;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
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
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
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
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
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
	@Override
	public String toString() {
		return "[{'id':'" + id + "', 'flight_number':'" + flight_number + "', 'first_class_remain_seats':'" + 
				first_class_remain_seats + "', 'business_class_remain_seats':'" + business_class_remain_seats + 
				"', 'economy_class_remain_seats':'" + economy_class_remain_seats + "', 'first_price':'" + 
				first_price + "', 'business_price':'" + business_price + "', 'economy_price':'" + 
				economy_price +"', 'start_date':'" + start_date + "', 'end_date':'" + end_date + 
				"', 'from_city':'" + from_city + "', 'to_city':'" + to_city + "', 'departure_time':'" + 
				departure_time + "', 'arrival_time':'" + arrival_time + "', 'start_airplane':'" + 
				start_airplane + "', 'end_airplane':'" + end_airplane + "'}]";
	}
}
