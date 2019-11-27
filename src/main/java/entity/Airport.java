package entity;

public class Airport {
	private int id;
	private String airport_code;
	private String city;
	private String airport_name;
	public Airport(int id, String airport_code, String city, String airport_name) {
		super();
		this.id = id;
		this.airport_code = airport_code;
		this.city = city;
		this.airport_name = airport_name;
	}
	public Airport() {
		super();
	}
	public int getId() {
		return id;
	}
	public String getAirport_code() {
		return airport_code;
	}
	public void setAirport_code(String airport_code) {
		this.airport_code = airport_code;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAirport_name() {
		return airport_name;
	}
	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}
	@Override
	public String toString() {
		return "[{'id':'" + id + "', 'airport_code':'" + airport_code + "', 'city':'" + city + "', 'airport_name':'"
				+ airport_name + "'}]";
	}
}
