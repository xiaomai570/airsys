package entity;

public class Boss {
	private int id;
	private String b_name;
	private String boss_number;
	private String boss_password;
	public Boss(int id, String b_name, String boss_number, String boss_password) {
		super();
		this.id = id;
		this.b_name = b_name;
		this.boss_number = boss_number;
		this.boss_password = boss_password;
	}
	public Boss() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getBoss_number() {
		return boss_number;
	}
	public void setBoss_number(String boss_number) {
		this.boss_number = boss_number;
	}
	public String getBoss_password() {
		return boss_password;
	}
	public void setBoss_password(String boss_password) {
		this.boss_password = boss_password;
	}
	@Override
	public String toString() {
		return "[{'id':'" + id + "', 'b_name':'" + b_name + "', 'boss_number':'" + boss_number + "', 'boss_password':'"
				+ boss_password + "'}]";
	}
	
}
