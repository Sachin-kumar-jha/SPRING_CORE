package com.test;

import java.util.List;

public class Employee {

	
    private int eid;
	
	private String ename;
	private String eaddress;

	private Account account;
	private List<String>listOfBooks;
	private Adhar adhar;
	public Employee() {
		
	}
	
	
	public Employee(Account account, List<String> listOfBooks, Adhar adhar) {
		System.out.println("CONST");
		this.account = account;
		this.listOfBooks = listOfBooks;
		this.adhar = adhar;
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
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public List<String> getListOfBooks() {
		return listOfBooks;
	}
	public void setListOfBooks(List<String> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}
	public Adhar getAdhar() {
		return adhar;
	}
	public void setAdhar(Adhar adhar) {
		this.adhar = adhar;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", account=" + account
				+ ", listOfBooks=" + listOfBooks + ", adhar=" + adhar + "]";
	}
}
