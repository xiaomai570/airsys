package entity.sales;


public class Customer {
      private int id;
      private String cName;
      private String cNumber;
      private String cPassword;
      private int sex;
      private String idCard;
      private String telephone;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String cName, String cNumber, String cPassword, int sex, String idCard, String telephone) {
		super();
		this.id = id;
		this.cName = cName;
		this.cNumber = cNumber;
		this.cPassword = cPassword;
		this.sex = sex;
		this.idCard = idCard;
		this.telephone = telephone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcNumber() {
		return cNumber;
	}
	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", cName=" + cName + ", cNumber=" + cNumber + ", cPassword=" + cPassword
				+ ", sex=" + sex + ", idCard=" + idCard + ", telephone=" + telephone + "]";
	}
}
      