package com.aryans.library.services.rest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aryans.library.controller.UserFlowControler;

public class ControllerFactory {
//	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("com/aryans/library/springConfigs/ModelDaoConfig.xml");
//	
//	public static UserFlowControler getUserFlowControllerBean() {
//		return (UserFlowControler) appContext.getBean("userFlowControler");
//	}
	String str1;
	long lng;
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public long getLng() {
		return lng;
	}
	public void setLng(long lng) {
		this.lng = lng;
	}
	
	
	
}
