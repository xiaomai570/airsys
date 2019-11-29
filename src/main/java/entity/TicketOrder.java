package entity;

public class TicketOrder {
	private int id;
	private String flight_number;
	private String passenger_name;
	private String certification_number;
	private String order_date;
	private String grade;
	private String branch_id;
	private String sales_id;
	public TicketOrder(int id, String flight_number, String passenger_name, String certification_number,
			String order_date, String grade, String branch_id, String sales_id) {
		super();
		this.id = id;
		this.flight_number = flight_number;
		this.passenger_name = passenger_name;
		this.certification_number = certification_number;
		this.order_date = order_date;
		this.grade = grade;
		this.branch_id = branch_id;
		this.sales_id = sales_id;
	}
	public TicketOrder() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getPassenger_name() {
		return passenger_name;
	}
	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}
	public String getCertification_number() {
		return certification_number;
	}
	public void setCertification_number(String certification_number) {
		this.certification_number = certification_number;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	public String getSales_id() {
		return sales_id;
	}
	public void setSales_id(String sales_id) {
		this.sales_id = sales_id;
	}
	@Override
	public String toString() {
		return "TicketOrder [id=" + id + ", flight_number=" + flight_number + ", passenger_name=" + passenger_name
				+ ", certification_number=" + certification_number + ", order_date=" + order_date + ", grade=" + grade
				+ ", branch_id=" + branch_id + ", sales_id=" + sales_id + "]";
	}
	
	
}
