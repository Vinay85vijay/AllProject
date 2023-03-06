package com.mirafra.email.employee_details;

public class Employe_Details {
	private int id;
	private  String name;
	private String employeeEmail;
	private String profession;
	public Employe_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	@Override
	public String toString() {
		return "Employe_Details [id=" + id + ", name=" + name + ", employeeEmail=" + employeeEmail + ", profession="
				+ profession + "]";
	}

}
