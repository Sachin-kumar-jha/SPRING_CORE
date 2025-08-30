package com.mainapp;

public class Service {

	private Dao dao; //Dependency:this is a dependency
	
	public void test1() {
		System.out.println("Service test1 Called");
		dao.test1();
	}
	
	
//	public Dao getDao() {
//		return dao;
//	}
//
//	public void setDao(Dao dao) {
//		this.dao = dao;
//		
//	}

	public Service(Dao dao) {
		this.dao = dao;
	}


	public void test2() {
		System.out.println("Service test2 Called");
		dao.test2();
	}
}
