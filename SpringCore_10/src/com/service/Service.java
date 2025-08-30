package com.service;

import com.dao.Dao;

public class Service {
private Dao dao;

	public void testService() {
		System.out.println("Service test called");
		dao.testDao();
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	
}
