package com.mainapp;

public class Demo {

	static {
		System.out.println("Demo Bean loading");
	}
	
	public Demo() {
		System.out.println("Hello");
	}
	
	public Demo(int a) {
		System.out.println("Demo Bean Instantiated");
	}
	
	public int  test() {
		System.out.println("Test");
		return 10;
		
	}
}
