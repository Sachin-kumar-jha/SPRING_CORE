package com.mainapp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class Launch {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		
		
	//Account for Raju user
		System.out.println("Raju account Creation");
	  Account acount =(Account)ac.getBean("account");
	  acount.setFullname("Raju");
	  acount.setUsername("raju122");
	  acount.setPassword("234234");
	  acount.setAddress("Sikandra");
	  System.out.println(acount);
	  
   // Account for Kaju user
		System.out.println("kaju account Creation");

	  Account kajuaccount =(Account)ac.getBean("account");
	  kajuaccount.setFullname("Kaju");
	  kajuaccount.setUsername("kaju122");
	  kajuaccount.setPassword("23df4234");
	  kajuaccount.setAddress("Kikandra");
	  System.out.println(kajuaccount);
	  
	  
	  
	  System.out.println("****** BOTH ACCOUNT DETAILS*********");
	  System.out.println(acount);
	  System.out.println(kajuaccount);
	  
	  System.out.println("Exit");
              
              
	}

}
