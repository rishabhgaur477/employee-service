package com.employee.employee_service.domain;

public class Employee {
      
	  
	  private String fname;
	  private String lname;
	  private Integer age;
	  private Double ctc;
	  private String eId;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getCtc() {
		return ctc;
	}
	public void setCtc(Double ctc) {
		this.ctc = ctc;
	}
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", age=" + age + ", ctc=" + ctc + ", eId=" + eId + "]";
	}
	public Employee(String fname, String lname, Integer age, Double ctc, String eId) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.ctc = ctc;
		this.eId = eId;
	}
	public Employee() {
		super();
	}
	  
	  
	  
	
	}
	  
	
	  
	  
	  

