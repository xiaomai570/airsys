package entity.sales;

public class Sales {
       private int id;
       private String jobId;
       private String sName;
       private String sPassword;
       private String sNumber;
       private String branchId;
	public Sales() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sales(int id, String jobId, String sName, String sPassword, String sNumber, String branchId) {
		super();
		this.id = id;
		this.jobId = jobId;
		this.sName = sName;
		this.sPassword = sPassword;
		this.sNumber = sNumber;
		this.branchId = branchId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsPassword() {
		return sPassword;
	}
	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}
	public String getsNumber() {
		return sNumber;
	}
	public void setsNumber(String sNumber) {
		this.sNumber = sNumber;
	}
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	@Override
	public String toString() {
		return "Sales [id=" + id + ", jobId=" + jobId + ", sName=" + sName + ", sPassword=" + sPassword + ", sNumber="
				+ sNumber + ", branchId=" + branchId + "]";
	}
	
       
}