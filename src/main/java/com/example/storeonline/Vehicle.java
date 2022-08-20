package com.example.storeonline;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Vehicle {
	
	@Bean
	Vehicle engine() //-->> engine là tên của Bean ( Vehicle )
	{
		return new Vehicle();
	}
	
	@Bean
	Person person()
	{
		return new Person();
	}
	
	@Bean
	Customer customer(Person person)
	{
		return new Customer(person);
	}
}
