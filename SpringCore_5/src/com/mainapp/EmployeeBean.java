package com.mainapp;

public class EmployeeBean {

	static {
		System.out.println("Bean Loading");
	}
	
	public EmployeeBean() {
		System.out.println("BEAN INSTANTIATION");
	}
	
	
	public void myXmlinit() {
		System.out.println("Resource Allocation");
	}
	public void test() {
		System.out.println("CUSTOM METHOD");
	}
	
	public void myXmlDestroy() {
		System.out.println("Resource DeAllocation");
	}
}
