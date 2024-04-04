package com.SpringjdbcprojectEntity;

public class Employee {

	private int eid;
	private String ename;
	private String Desgn ;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, String desgn) {
		super();
		this.eid = eid;
		this.ename = ename;
		Desgn = desgn;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesgn() {
		return Desgn;
	}
	public void setDesgn(String desgn) {
		Desgn = desgn;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", Desgn=" + Desgn + "]";
	}
}
