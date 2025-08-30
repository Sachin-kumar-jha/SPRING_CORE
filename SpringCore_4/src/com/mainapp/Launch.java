package com.mainapp;


import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Launch {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		
              Controller con = (Controller)ac.getBean("controller");
              
              con.doPost();
              con.doGet();
              
	}

}
