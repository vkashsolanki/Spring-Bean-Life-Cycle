package com.learn.AnotationTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.learn.AnotationTest")
public class JavaConfig {
	
	@Bean
	public Address getAddress()
	{
		
		return new Address();
	}
	
	
	

}
