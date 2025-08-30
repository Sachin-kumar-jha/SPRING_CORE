package com.test;

public class Student {
	private int countrycode;
	private String countryName;
	private  String policy;
	private int sid;
	private String sname;
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
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [countrycode=" + countrycode + ", countryName=" + countryName + ", policy=" + policy + ", sid="
				+ sid + ", sname=" + sname + "]";
	}
	
}
