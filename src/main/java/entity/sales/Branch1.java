package entity.sales;

public class Branch1 {
        private int id;
        private String bName;
        private String address;
        private String telephone;
        private String province;
        private String city;
        private String bPassword;
        private String branchId;
        private String branchSales;
		public Branch1() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Branch1(int id, String bName, String address, String telephone, String province, String city,
				String bPassword, String branchId, String branchSales) {
			super();
			this.id = id;
			this.bName = bName;
			this.address = address;
			this.telephone = telephone;
			this.province = province;
			this.city = city;
			this.bPassword = bPassword;
			this.branchId = branchId;
			this.branchSales = branchSales;
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
		public String getbPassword() {
			return bPassword;
		}
		public void setbPassword(String bPassword) {
			this.bPassword = bPassword;
		}
		public String getBranchId() {
			return branchId;
		}
		public void setBranchId(String branchId) {
			this.branchId = branchId;
		}
		public String getBranchSales() {
			return branchSales;
		}
		public void setBranchSales(String branchSales) {
			this.branchSales = branchSales;
		}
		@Override
		public String toString() {
			return "Branch1 [id=" + id + ", bName=" + bName + ", address=" + address + ", telephone=" + telephone
					+ ", province=" + province + ", city=" + city + ", bPassword=" + bPassword + ", branchId="
					+ branchId + ", branchSales=" + branchSales + "]";
		}
}