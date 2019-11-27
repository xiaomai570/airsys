package entity.sales;

public class User {
        private String address;
        private String sumber;
        private String jobId;
        private String sname;
        private String spassword;
        private String sales;
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(String address, String sumber, String jobId, String sname, String spassword, String sales) {
			super();
			this.address = address;
			this.sumber = sumber;
			this.jobId = jobId;
			this.sname = sname;
			this.spassword = spassword;
			this.sales = sales;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getSumber() {
			return sumber;
		}
		public void setSumber(String sumber) {
			this.sumber = sumber;
		}
		public String getjobId() {
			return jobId;
		}
		public void setjobId(String jobId) {
			this.jobId = jobId;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getSpassword() {
			return spassword;
		}
		public void setSpassword(String spassword) {
			this.spassword = spassword;
		}
		public String getSales() {
			return sales;
		}
		public void setSales(String sales) {
			this.sales = sales;
		}
		@Override
		public String toString() {
			return "User [address=" + address + ", sumber=" + sumber + ", jobId=" + jobId + ", sname=" + sname
					+ ", spassword=" + spassword + ", sales=" + sales + "]";
		}
		
}
