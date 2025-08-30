package com.controller;

import com.service.Service;

public class Controller {
private Service service;
	public void doPost() {
		System.out.println("Controller post called");
		service.testService();
	}
	public void setService(Service service) {
		this.service = service;
	}
	
}
