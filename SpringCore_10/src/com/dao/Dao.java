package com.dao;

import javax.annotation.PostConstruct;

public class Dao {
private String connection;


@PostConstruct
public String init() {
	  String connect="CONNECTION";
	  this.connection=connect;
	  return connect;
}
	public void testDao() {
		System.out.println("Dao test called:"+connection);
	}
}
