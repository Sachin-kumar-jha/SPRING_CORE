package com.test;

public class Account implements Comparable<Account> {

	//Fixed
	private int an;
	private String aname;
	public Account() {
		
	}
	public Account(int an, String aname) {
		this.an = an;
		this.aname = aname;
	}
	public int getAn() {
		return an;
	}
	public void setAn(int an) {
		this.an = an;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Account [an=" + an + ", aname=" + aname + "]";
	}
	@Override
	public int compareTo(Account o) {
		
	 return Integer.compare(this.an, o.an);
	}
	
	
	
}
