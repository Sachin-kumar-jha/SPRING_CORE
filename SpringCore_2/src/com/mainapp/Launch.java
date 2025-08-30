package com.mainapp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class Launch {

	public static void main(String[] args) {
	 /*Here object created automatically using xml file loaded by classpathxmlApplicationContext inbuilt class
	  * and then we get all methods of class*/
             ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		  
             //Here both class object created but in conditional code we don't need this 
             //object if condition fails so here in xml we make lazy feature here we  add lazy-init="true"
         
              
              Demo demo = (Demo)ac.getBean("demo");
             if(demo.test()==11) {
            	  Femo femo = (Femo)ac.getBean("femo");
                  femo.test();
             }
            
              System.out.println("Exit");
              
              
	}

}
