package com.learn.AnotationTest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Address {
	
	@Value("New Delhi")
	private String city;
	
	@Value("Number 786")
	private String gali;
	
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGali() {
		return gali;
	}
	public void setGali(String gali) {
		this.gali = gali;
	}

	

}
