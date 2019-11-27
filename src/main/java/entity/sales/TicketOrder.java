package entity.sales;

import java.util.Date;

public class TicketOrder {
      private int id;
      private String flightNumber;
      private String passengerName;
      private String certificationNumber;
      private Date orderDate;
      private String grade;
      private String passwngerType;
      private String branchId;
      private String salesId;
	public TicketOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketOrder(int id, String flightNumber, String passengerName, String certificationNumber, Date orderDate,
			String grade, String passwngerType, String branchId, String salesId) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.passengerName = passengerName;
		this.certificationNumber = certificationNumber;
		this.orderDate = orderDate;
		this.grade = grade;
		this.passwngerType = passwngerType;
		this.branchId = branchId;
		this.salesId = salesId;
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
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getCertificationNumber() {
		return certificationNumber;
	}
	public void setCertificationNumber(String certificationNumber) {
		this.certificationNumber = certificationNumber;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getPasswngerType() {
		return passwngerType;
	}
	public void setPasswngerType(String passwngerType) {
		this.passwngerType = passwngerType;
	}
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getSalesId() {
		return salesId;
	}
	public void setSalesId(String salesId) {
		this.salesId = salesId;
	}
	@Override
	public String toString() {
		return "TicketOrder [id=" + id + ", flightNumber=" + flightNumber + ", passengerName=" + passengerName
				+ ", certificationNumber=" + certificationNumber + ", orderDate=" + orderDate + ", grade=" + grade
				+ ", passwngerType=" + passwngerType + ", branchId=" + branchId + ", salesId=" + salesId + "]";
	}
      
}
	