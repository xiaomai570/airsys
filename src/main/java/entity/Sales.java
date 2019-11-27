package entity;

public class Sales {
	private int id;
	private String job_id;
	private String s_name;
	private String s_number;
	private String s_password;
	private String branch_id;
	public Sales() {
		super();
	}
	public Sales(int id, String job_id, String s_name, String s_number, String s_password,String branch_id) {
		super();
		this.id = id;
		this.job_id = job_id;
		this.s_name = s_name;
		this.s_number = s_number;
		this.s_password = s_password;
		this.branch_id = branch_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_number() {
		return s_number;
	}
	public void setS_number(String s_number) {
		this.s_number = s_number;
	}
	public String getS_password() {
		return s_password;
	}
	public void setS_password(String s_password) {
		this.s_password = s_password;
	}
	public String getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	@Override
	public String toString() {
		return "[{'id':'" + id + "', 'job_id':'" + job_id + "', 's_name':'" + s_name + "', 's_number':'" + s_number
				+ "', 's_password':'" + s_password + "', 'branch_id':'" + branch_id + "'}]";
	}
	
}
