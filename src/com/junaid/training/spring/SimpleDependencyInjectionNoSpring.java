package com.junaid.training.spring;

import java.util.HashMap;
import java.util.Map;

public class SimpleDependencyInjectionNoSpring {
	
	
	public static void main(String args[]) { 
		
		
		SimpleDependancyInjection student  = new SimpleDependancyInjection();
		student.setYourName("Sinan");
		student.setCurrentWork("J2ee Trainee");
		
		HashMap<String,String> specialization = new HashMap<String,String>();
		specialization.put("core", "java");
		specialization.put("advanced", "j2ee");
		specialization.put("frameworks", "Struts,Spring.Hibernate,JMS,Webservices");
		
		student.setYourSpecialization(specialization);
		
		
		
		Address address = new Address();
		address.setStreetname("someStreet");
		address.setCity("Richardson");
		
		
		
		
		HashMap<String,Address> Key1 = new HashMap<String,Address>();
		Key1.put("addressKey", address);
		
		
		student.setAddress(Key1);
		
		
		
		System.out.println(student.getAddress().get("Key2").getCity());
		
		
	}

}
