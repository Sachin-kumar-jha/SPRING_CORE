package com.mainapp;

public class Controller {


	private Service service; //Dependency:this is a dependency
	
	
	
public Controller(Service service) {
		this.service = service;
	}

//	public Service getService() {
//		return service;
//	}
//
//	public void setService(Service service) {
//		this.service = service;
//	}

	public void doPost() {
		System.out.println("Controller doPost Called");
		service.test1();
	}
	
	public void doGet() {
		System.out.println("Controller doGet Called");
		service.test2();
	}
}
