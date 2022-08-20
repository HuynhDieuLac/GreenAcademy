package com.example.storeonline.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "permission")
public class Permission {

	@Id
	@Column(name = "idPermission")
	@GeneratedValue
	private Integer idPermission;

	@Column(name = "name")
	private String name;
	
	@ManyToMany(mappedBy = "permissions")
	private List<Employee> employee;

	public Integer getIdPermission() {
		return idPermission;
	}

	
	
	public void setIdPermission(Integer idPermission) {
		this.idPermission = idPermission;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	
	
	
	
}
