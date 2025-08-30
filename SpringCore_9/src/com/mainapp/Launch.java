package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.Client;
import com.test.Employee;
import com.test.Student;

public class Launch {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Employee emp = (Employee) ac.getBean("emp");
		emp.setEid(11);
		emp.setEname("sachin");
		
		
		Student std = (Student) ac.getBean("std");
		std.setSid(12);
		std.setSname("gagan");
		
		Client cl = (Client)ac.getBean("client");
		cl.setCid(13);
		cl.setCname("Vipin");
		
		System.out.println(emp);
		System.out.println(std);
		System.out.println(cl);
	}

}
