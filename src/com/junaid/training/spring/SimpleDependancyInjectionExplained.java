package com.junaid.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleDependancyInjectionExplained {

	public static void main(String[] args) {
		ApplicationContext context =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		SimpleDependancyInjection sdInJPojo = (SimpleDependancyInjection) context.getBean("SimpleDependancyInjection");
		
		System.out.println("The name of the studetn is "+sdInJPojo.getYourName());
		System.out.println("Currently he/She is"+sdInJPojo.getCurrentWork());
		System.out.println("And this is the profile" +sdInJPojo.getYourSpecialization().get("languages"));
		System.out.println(sdInJPojo.getYourSpecialization().get("web"));
	    System.out.println(sdInJPojo.getAge());
	    
	    System.out.println(sdInJPojo.getAddress().get("Key2").getCity());
		
		}
	
}
