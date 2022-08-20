package com.example.storeonline.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeeDetail")
public class EmployeeDetail {
	
	@Id
	@Column(name= "id")
	private Integer id;
	
	
	@Column(name = "age")
	private Integer age;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
