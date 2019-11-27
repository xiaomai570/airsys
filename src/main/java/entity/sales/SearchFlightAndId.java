package entity.sales;



public class SearchFlightAndId {
	  private String flightNumber;
      private String fromCity;
      private String toCity;
      private String idCard;
      private String grade;
	public SearchFlightAndId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchFlightAndId(String flightNumber, String fromCity, String toCity, String idCard, String grade) {
		super();
		this.flightNumber = flightNumber;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.idCard = idCard;
		this.grade = grade;
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
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "SearchFlightAndId [flightNumber=" + flightNumber + ", fromCity=" + fromCity + ", toCity=" + toCity
				+ ", idCard=" + idCard + ", grade=" + grade + "]";
	}
      
      
      
}