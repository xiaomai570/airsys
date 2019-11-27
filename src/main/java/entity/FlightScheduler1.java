package entity;

public class FlightScheduler1 {
	private int id;
	private String flight_number;
	private String start_date;
	private String end_date;
	private String from_city;
	private String to_city;
	private String departure_time;
	private String arrival_time;
	private String start_airplane;
	private String end_airplane;
	private String total;
	public FlightScheduler1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightScheduler1(int id, String flight_number, String start_date, String end_date, String from_city,
			String to_city, String departure_time, String arrival_time, String start_airplane, String end_airplane,
			String total) {
		super();
		this.id = id;
		this.flight_number = flight_number;
		this.start_date = start_date;
		this.end_date = end_date;
		this.from_city = from_city;
		this.to_city = to_city;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.start_airplane = start_airplane;
		this.end_airplane = end_airplane;
		this.total = total;
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
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "FlightScheduler1 [id=" + id + ", flight_number=" + flight_number + ", start_date=" + start_date
				+ ", end_date=" + end_date + ", from_city=" + from_city + ", to_city=" + to_city + ", departure_time="
				+ departure_time + ", arrival_time=" + arrival_time + ", start_airplane=" + start_airplane
				+ ", end_airplane=" + end_airplane + ", total=" + total + "]";
	}
	
}