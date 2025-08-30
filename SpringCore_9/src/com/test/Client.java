package com.test;

public class Client {
	private int countrycode;
	private String countryName;
	private  String policy;
	private int cid;
	private String cname;
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
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Client [countrycode=" + countrycode + ", countryName=" + countryName + ", policy=" + policy + ", cid="
				+ cid + ", cname=" + cname + "]";
	}
	
}
