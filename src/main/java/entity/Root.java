package entity;

public class Root {
	private String r_name;
	private String root_number;
	private String root_password;
	public Root() {
		super();
	}
	public Root(String r_name, String root_number, String root_password) {
		super();
		this.r_name = r_name;
		this.root_number = root_number;
		this.root_password = root_password;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public String getRoot_number() {
		return root_number;
	}
	public void setRoot_number(String root_number) {
		this.root_number = root_number;
	}
	public String getRoot_password() {
		return root_password;
	}
	public void setRoot_password(String root_password) {
		this.root_password = root_password;
	}
	@Override
	public String toString() {
		return "[{'r_name':'" + r_name + "', 'root_number':'" + root_number + "', 'root_password':'" + root_password + "'}]";
	}
}
