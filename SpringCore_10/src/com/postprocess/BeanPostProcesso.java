package com.postprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.controller.Controller;
import com.dao.Dao;
import com.service.Service;

public class BeanPostProcesso implements BeanPostProcessor {
@Override
public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	System.out.println("After");
	if(bean instanceof Controller) {
		System.out.println("Controller instantiation with id:"+beanName);
	}else if(bean instanceof Service) {
		System.out.println("Service instantiation with id:"+beanName);
	}else {
		Dao dao=(Dao)bean;
	    String result=dao.init();
	    if(result.equals("CONNECTION ESTABLISHED")) {
	    	System.out.println("Dao instantiation with id:"+beanName);
	    }else {
	    	System.out.println("Dao not succesfully instantiated with id:"+beanName);
	    }
		
	}
	return bean;
}

@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	System.out.println("before");
	if(bean instanceof Controller) {
		
		System.out.println("Controller instantiation with id:"+beanName);
	}else if(bean instanceof Service) {
		System.out.println("Service instantiation with id:"+beanName);
	}else {
		System.out.println("Dao instantiation with id:"+beanName);
	}
	return bean;
	}
}
