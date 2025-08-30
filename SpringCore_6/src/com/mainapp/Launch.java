package com.mainapp;


import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Launch {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		
          EmployeeBean bean = (EmployeeBean)ac.getBean("emp");
          
          bean.test();
          
        /**Here bean destroy method automatically called in singleton scope
         * If we have prototype scope then we need to call explicitly*/
        bean.myXAnnotationDestroy();
        bean.myXmlDestroy();
        ac.close(); 
        
	}

}
