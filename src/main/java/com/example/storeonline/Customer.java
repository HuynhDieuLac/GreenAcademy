package com.example.storeonline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Customer {
	//@Autowired
	//private Person person;  ---> Cách 1
	
	//Cách 2: dependecy contrustor
	private final Person person; //Final chỉ được khởi gán 1 lần
	
	Customer(Person person){
		this.person = person;
	}
	
	public String getPersonName()
	{
		return person.getName();
	}
}
