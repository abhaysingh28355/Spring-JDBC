package com.firstSpringJDBCProgram.Entity;

public class Student {

	private int id;
	private String name;
	private String city;
	private String State;
	private String pincode;
	
	public Student() {
		
	
	}

	public Student(int id, String name, String city, String state, String pincode) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		State = state;
		this.pincode = pincode;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", State=" + State + ", pincode=" + pincode
				+ "]";
	}
	
	
}
