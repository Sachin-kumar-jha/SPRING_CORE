package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


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
	
	@PostConstruct
	public void myAnntationinit() {
		System.out.println("Resource Allocation");
	}
	public void test() {
		System.out.println("CUSTOM METHOD");
	}
	
	@PreDestroy
	public void myXAnnotationDestroy() {
		System.out.println("Resource DeAllocation");
	}
	public void myXmlDestroy() {
		System.out.println("Resource DeAllocation");
	}
}
