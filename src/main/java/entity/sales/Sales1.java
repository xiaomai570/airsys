package entity.sales;

public class Sales1 {
       private int id;
       private String jobId;
       private String sName;
       private String sPassword;
       private String sNumber;
       private String branchId;
       private String salesOrder;
	public Sales1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sales1(int id, String jobId, String sName, String sPassword, String sNumber, String branchId,
			String salesOrder) {
		super();
		this.id = id;
		this.jobId = jobId;
		this.sName = sName;
		this.sPassword = sPassword;
		this.sNumber = sNumber;
		this.branchId = branchId;
		this.salesOrder = salesOrder;
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
	public String getSalesOrder() {
		return salesOrder;
	}
	public void setSalesOrder(String salesOrder) {
		this.salesOrder = salesOrder;
	}
	@Override
	public String toString() {
		return "Sales1 [id=" + id + ", jobId=" + jobId + ", sName=" + sName + ", sPassword=" + sPassword + ", sNumber="
				+ sNumber + ", branchId=" + branchId + ", salesOrder=" + salesOrder + "]";
	}
}