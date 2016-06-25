package com.junaid.training.spring;

import java.util.HashMap;
import java.util.Map;

public class SimpleDependancyInjection {
	
	private String currentWork;
	private String yourName;
	private HashMap<String,String> yourSpecialization;
	
	
	private HashMap<String,Address> address;
	
	
	public HashMap<String, Address> getAddress() {
		return address;
	}
	public void setAddress(HashMap<String, Address> address) {
		this.address = address;
	}
	private int age;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCurrentWork() {
		return currentWork;
	}
	public void setCurrentWork(String currentWork) {
		this.currentWork = currentWork;
	}
	public String getYourName() {
		return yourName;
	}
	public void setYourName(String yourName) {
		this.yourName = yourName;
	}
	public HashMap<String, String> getYourSpecialization() {
		return yourSpecialization;
	}
	public void setYourSpecialization(HashMap<String, String> yourSpecialization) {
		this.yourSpecialization = yourSpecialization;
	}

}
