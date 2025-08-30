package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class EmployeeBean implements InitializingBean,DisposableBean {

	static {
		System.out.println("Bean Loading");
	}
	
	public EmployeeBean() {
		System.out.println("BEAN INSTANTIATION");
	}

	// This is destroy method
	@Override
	public void destroy() throws Exception {
		System.out.println("Resource DeAllocation using callback interface");
	}

	
	//This is init method
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Resource Allocation using callback interface");
	}
	
	

	public void myXmlinit() {
		System.out.println("Resource Allocation using xml");
	}
	
	@PostConstruct
	public void myAnntationinit() {
		System.out.println("Resource Allocation  annotation");
	}
	public void test() {
		System.out.println("CUSTOM METHOD");
	}
	
	@PreDestroy
	public void myXAnnotationDestroy() {
		System.out.println("Resource DeAllocation using annotation");
	}
	public void myXmlDestroy() {
		System.out.println("Resource DeAllocation using xml");
	}
}
