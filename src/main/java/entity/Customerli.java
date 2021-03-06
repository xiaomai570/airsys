package entity;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("Customerli")
public class Customerli {

	private int id;
	private String c_name;
	private String c_number;
	private String c_password;
	private String sex;
	private Date age;
	private String id_card;
	private String phone;

	public Customerli() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customerli(int id, String c_name, String c_number, String c_password, String sex, Date age, String id_card,
			String phone) {
		super();
		this.id = id;
		this.c_name = c_name;
		this.c_number = c_number;
		this.c_password = c_password;
		this.sex = sex;
		this.age = age;
		this.id_card = id_card;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_number() {
		return c_number;
	}

	public void setC_number(String c_number) {
		this.c_number = c_number;
	}

	public String getC_password() {
		return c_password;
	}

	public void setC_password(String c_password) {
		this.c_password = c_password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getAge() {
		return age;
	}

	public void setAge(Date age) {
		this.age = age;
	}

	public String getId_card() {
		return id_card;
	}

	public void setId_card(String id_card) {
		this.id_card = id_card;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", c_name=" + c_name + ", c_number=" + c_number + ", c_password=" + c_password
				+ ", sex=" + sex + ", age=" + age + ", id_card=" + id_card + ", phone=" + phone + "]";
	}

}
