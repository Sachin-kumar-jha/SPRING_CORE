package com.mainapp;

public class Femo {
	static {
		System.out.println("Femo Bean loading");
	}
	
	public Femo() {
		System.out.println("Femo Bean Instantiated");
	}
	
	public void test() {
		System.out.println("Test");
	}
}
