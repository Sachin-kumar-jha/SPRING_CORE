package com.mainapp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class Launch {

	public static void main(String[] args) {
	 
	ClassPathResource resource = new ClassPathResource("bean.xml");
		  
              @SuppressWarnings("unused")
			  XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource); //Inversion of Control
              
              Demo demo = (Demo) xmlBeanFactory.getBean("demo");
              demo.test();
              Femo femo = (Femo) xmlBeanFactory.getBean("femo");
              femo.test();
              System.out.println("Exit");
              
              
	}

}
