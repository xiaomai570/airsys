package entity;

public class Flight {
	private int id;
	private String flight_number;
	private int first_class_remain_seats;
	private int business_class_remain_seats;
	private int economy_class_remain_seats;
	private int first_price;
	private int business_price;
	private int economy_price;
	public Flight() {
		super();
	}
	public Flight(int id, String flight_number, int first_class_remain_seats, int business_class_remain_seats, int economy_class_remain_seats, int first_price, int business_price, int economy_price) {
		super();
		this.id = id;
		this.flight_number = flight_number;
		this.first_class_remain_seats = first_class_remain_seats;
		this.business_class_remain_seats = business_class_remain_seats;
		this.economy_class_remain_seats = economy_class_remain_seats;
		this.first_price = first_price;
		this.business_price = business_price;
		this.economy_price = economy_price;
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
	@Override
	public String toString() {
		return "[{'id':'" + id + "', 'flight_number':'" + flight_number + "', 'first_class_remain_seats':'" + first_class_remain_seats + 
				"', 'business_class_remain_seats':'" + business_class_remain_seats + "', 'economy_class_remain_seats':'" + economy_class_remain_seats +
				"', 'first_price':'" + first_price + "', 'business_price':'" + 
				business_price + "', 'economy_price':'" + economy_price + "'}]";
	}
	
}