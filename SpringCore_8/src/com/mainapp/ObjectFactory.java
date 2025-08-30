package com.mainapp;

import java.util.Scanner;

public class ObjectFactory {
	public  EmployeeBean customObject() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key");
		EmployeeBean employeeBean;
		int key = sc.nextInt();
		if(key==123) {
			employeeBean=new EmployeeBean("QWERTY");
		}else {
			employeeBean=new EmployeeBean("PQRS");
		}
		
		sc.close();
		return employeeBean;
	}

}
