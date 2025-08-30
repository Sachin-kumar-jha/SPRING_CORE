package com.test;

import java.util.List;

public class Employee {

	
    private int eid;
	
	private String ename;
	private String eaddress;
	
//	private List<String> defaultListOfBooks;
	private List<Account> defaultListOfAccounts; //Dependency
	

	public Employee() {
		
	}
	public Employee(List<Account> defaultListOfAccounts) {
		
		this.defaultListOfAccounts = defaultListOfAccounts;
	}


	
	

//	public Employee(List<String> defaultListOfBooks) {
//		this.defaultListOfBooks = defaultListOfBooks;
//	}


	public List<Account> getDefaultListOfAccounts() {
		return defaultListOfAccounts;
	}
	public void setDefaultListOfAccounts(List<Account> defaultListOfAccounts) {
		this.defaultListOfAccounts = defaultListOfAccounts;
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

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

//	public List<String> getDefaultListOfBooks() {
//		return defaultListOfBooks;
//	}
//
//	public void setDefaultListOfBooks(List<String> defaultListOfBooks) {
//		this.defaultListOfBooks = defaultListOfBooks;
//	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", defaultListOfBooks="
				+ defaultListOfAccounts + "]";
	}
	
	
	
}
