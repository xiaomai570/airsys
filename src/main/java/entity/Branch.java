package entity;

public class Branch {
	private int id;
	private String b_name;
	private String address;
	private String telephone;
	private String province;
	private String city;
	private String b_password;
	private String branch_id;
	public Branch() {
		super();
	}
	public Branch(int id, String b_name, String address, String telephone, String province, String city,String b_password,String branch_id) {
		super();
		this.id = id;
		this.b_name = b_name;
		this.address = address;
		this.telephone = telephone;
		this.province = province;
		this.city = city;
		this.b_password = b_password;
		this.branch_id = branch_id;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getB_password() {
		return b_password;
	}
	public void setB_password(String b_password) {
		this.b_password = b_password;
	}
	public String getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	@Override
	public String toString() {
		return "[{'id':'" + id + "', 'b_name':'" + b_name + "', 'address':'" + address + "', 'telephone':'"
				+ telephone + "', 'province':'" + province + "', 'city':'" + city + "', 'b_password':'"
				+ b_password + "', 'branch_id':'" + branch_id + "'}]";
	}
	
}
