package com.example.storeonline.service;

import java.util.List;
import java.util.Optional;

import org.aspectj.apache.bcel.classfile.Module.Uses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.storeonline.entity.*;
import com.example.storeonline.repository.*;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	public User saveUser(User user)
	{
		User saveUser = userRepository.save(user);
		return saveUser;
	}
	
	public User findUserById(Long id)
	{
		Optional<User> optionalUser = userRepository.findById(id);
		return optionalUser.get();
	}
	
	public User updateUser(User user, Long id)
	{
		User currenUser = findUserById(id);
		currenUser.setFirstName(user.getFirstName());
		currenUser.setLastName(user.getLastName());
		currenUser.setEmail(user.getEmail());
		
		return userRepository.save(currenUser);
	}
	
	public void deleteUser(Long id)
	{
		User currenUser1 = findUserById(id);
		userRepository.delete(currenUser1);
	}
}
