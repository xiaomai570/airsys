package entity.sales;

public class Root {
      private int id;
      private String rname;
      private String rootNumber;
      private String rootPassword;
	public Root() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Root(int id, String rname, String rootNumber, String rootPassword) {
		super();
		this.id = id;
		this.rname = rname;
		this.rootNumber = rootNumber;
		this.rootPassword = rootPassword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRootNumber() {
		return rootNumber;
	}
	public void setRootNumber(String rootNumber) {
		this.rootNumber = rootNumber;
	}
	public String getRootPassword() {
		return rootPassword;
	}
	public void setRootPassword(String rootPassword) {
		this.rootPassword = rootPassword;
	}
	@Override
	public String toString() {
		return "Root [id=" + id + ", rname=" + rname + ", rootNumber=" + rootNumber + ", rootPassword=" + rootPassword
				+ "]";
	}
      
      
}
