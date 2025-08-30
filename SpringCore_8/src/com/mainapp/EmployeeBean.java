package com.mainapp;

public class EmployeeBean {
private String companyCode;
	static {
		System.out.println("Bean Loading");
	}
	
	public EmployeeBean() {
		System.out.println("BEAN INSTANTIATION");
	}

	
	public EmployeeBean(String companyCode) {

		this.companyCode = companyCode;
	}

	
	public void test() {
		System.out.println("CUSTOM METHOD"+" "+companyCode);
	}
	
	
}
