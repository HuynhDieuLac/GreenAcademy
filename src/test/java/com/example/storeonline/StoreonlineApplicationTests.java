package com.example.storeonline;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.storeonline.entity.Employee;
import com.example.storeonline.repository.EmployeeRepository;

@SpringBootTest
class StoreonlineApplicationTests implements CommandLineRunner{

	@Autowired
	private Customer customer;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("----------Continue------------");
		
		Employee employee1 = new Employee();
		
	}
	
}
