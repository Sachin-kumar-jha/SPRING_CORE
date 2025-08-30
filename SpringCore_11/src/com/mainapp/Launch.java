package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.Employee;



public class Launch {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Employee emp = (Employee) ac.getBean("emp");
		emp.setEid(11);
		emp.setEname("sachin");
		emp.setEaddress("Sikandra");
		
		
		
		System.out.println(emp);
		System.out.println(emp.getDefaultListOfAccounts().getClass());
		ac.close();
		
	}

}
