package com.test;

import java.util.Map;
import java.util.Set;

public class Employee {

	
    private int eid;
	
	private String ename;
	private String eaddress;
//	private Map<String,String>mapOfAccount;
	private Map<String,Account>mapOfAccouts;
	public Employee() {
		
	}


	

public Employee(Map<String, Account> mapOfAccouts) {
		super();
		this.mapOfAccouts = mapOfAccouts;
	}




//	public Employee(Map<String, String> mapOfAccount) {
//		super();
//		this.mapOfAccount = mapOfAccount;
//	}
//
//
//
//
//	public Map<String, String> getMapOfAccount() {
//		return mapOfAccount;
//	}
//
//
//
//
//	public void setMapOfAccount(Map<String, String> mapOfAccount) {
//		this.mapOfAccount = mapOfAccount;
//	}




	public Map<String, Account> getMapOfAccouts() {
		return mapOfAccouts;
	}




	public void setMapOfAccouts(Map<String, Account> mapOfAccouts) {
		this.mapOfAccouts = mapOfAccouts;
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




	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", mapOfAccouts=" + mapOfAccouts
				+ "]";
	}








	
	

	
}
