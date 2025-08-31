package com.test;

import java.util.Set;

public class Employee {

	
    private int eid;
	
	private String ename;
	private String eaddress;
	private Set<Account>setOfAccount;
	
	public Employee() {
		
	}


	public Employee(Set<Account> setOfAccount) {
		this.setOfAccount = setOfAccount;
	}

	public Set<Account> getSetOfAccount() {
		return setOfAccount;
	}


	public void setSetOfAccount(Set<Account> setOfAccount) {
		this.setOfAccount = setOfAccount;
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
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", setOfAccount=" + setOfAccount
				+ "]";
	}




	
	

	
}
