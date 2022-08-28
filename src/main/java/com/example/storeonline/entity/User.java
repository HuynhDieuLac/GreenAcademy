package com.example.storeonline.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotBlank(message = "First name is mandatory")
	@Column(name="first_name", nullable = false)// not blank thể hiện thông báo tại trang, nếu để trống sẽ xuất thông báo
	private String firstName;
	
	@NotBlank(message = "Last name is mandatory")
	@Column(name="last_name", nullable = false)
	private String lastName;
	
	@NotBlank(message = "Email is mandatory")
	@Email(message = "Invail email")
	@Column(name="email", nullable = false)
	private String email;
	
	public User() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
