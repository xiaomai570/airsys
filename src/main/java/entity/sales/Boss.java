package entity.sales;

public class Boss {
       private int id;
       private String bName;
       private String bossNumber;
       private String bossPassword;
	public Boss() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Boss(int id, String bName, String bossNumber, String bossPassword) {
		super();
		this.id = id;
		this.bName = bName;
		this.bossNumber = bossNumber;
		this.bossPassword = bossPassword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getBossNumber() {
		return bossNumber;
	}
	public void setBossNumber(String bossNumber) {
		this.bossNumber = bossNumber;
	}
	public String getBossPassword() {
		return bossPassword;
	}
	public void setBossPassword(String bossPassword) {
		this.bossPassword = bossPassword;
	}
	@Override
	public String toString() {
		return "Boss [id=" + id + ", bName=" + bName + ", bossNumber=" + bossNumber + ", bossPassword=" + bossPassword
				+ "]";
	}
	
}