package com.example.storeonline;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.storeonline.entity.Department;
import com.example.storeonline.entity.Employee;
import com.example.storeonline.entity.EmployeeDetail;
import com.example.storeonline.entity.Permission;
import com.example.storeonline.repository.EmployeeRepository;

@SpringBootApplication
public class StoreonlineApplication implements CommandLineRunner {
	
	@Autowired
	private Customer customer;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(StoreonlineApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception
	{
		System.out.println("----------CommandLineRunner---------------");
		System.out.println("Customeer Name: " +customer.getPersonName());
		
		/*
		 * Employee employee1 = new Employee(); employee1.setName("Nguyen Van A");
		 * employeeRepository.save(employee1);
		 * 
		 * EmployeeDetail employee2 = new EmployeeDetail(); employee2.setAge(20);
		 * employee2.setId(employee1.getId()); Employee saveEmployee =
		 * employeeRepository.save(employee1); Integer saveEmployeeId =
		 * saveEmployee.getId();
		 */	
		List<Employee> employeeList = employeeRepository.findAll();
		for(Employee employee : employeeList)
		{
			System.out.println("Employee Name: " + employee.getName());
		}
		
		System.out.println("----------Continue------------");
		Employee employee1 = new Employee();
		
		Permission perm = new Permission();
		perm.setName("Admin");
		
		Permission perm1 = new Permission();
		perm.setName("Manager");
//		
		List<Permission> permissionList = new ArrayList<Permission>();
		permissionList.add(perm);
		permissionList.add(perm1);
//		
		Department dept = new Department();
		dept.setName("IT");
//		
		employee1.setName("Hung");
		employee1.setDepartment(dept);
		employee1.setPermissions(permissionList);
//		
//		
		employeeRepository.save(employee1);
		
		Optional<Employee> employee48Optional = employeeRepository.findById(12);
		Employee employee48 = employee48Optional.get();
		
		employee48.setName("An");
		employee48.setDateOfBirthday(new Date());
		
		employeeRepository.save(employee48);
//		
//		employeeRepository.deleteById(48);
	}
}
