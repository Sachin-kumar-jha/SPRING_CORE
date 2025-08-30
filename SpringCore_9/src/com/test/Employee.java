package com.test;

public class Employee {

	private int countrycode;
	private String countryName;
	private  String policy;
	private int eid;
	private String ename;
	public int getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(int countrycode) {
		this.countrycode = countrycode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
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
	@Override
	public String toString() {
		return "Employee [countrycode=" + countrycode + ", countryName=" + countryName + ", policy=" + policy + ", eid="
				+ eid + ", ename=" + ename + "]";
	}
	
}
