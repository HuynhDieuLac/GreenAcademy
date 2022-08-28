package com.example.storeonline.controller;

import java.util.List;
import java.util.concurrent.ExecutorService;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.storeonline.entity.*;
import com.example.storeonline.repository.*;
import com.example.storeonline.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public String showUserList(@RequestParam(name= "page", required = false, defaultValue = "1")  int pageNumber, Model model) {
		int pageSize = 5; // số lượng User cho 1 trang
		Page<User> pageUser = userService.findAll(pageNumber, pageSize);
		
		List<User> users = pageUser.getContent();
		model.addAttribute("currentPage", pageNumber);
		model.addAttribute("totalPages", pageUser.getTotalPages());
		model.addAttribute("totalItems", pageUser.getTotalElements());
		model.addAttribute("users", users);
		return "user";
	}

	@GetMapping("/signup")
	public String showSignUpForm(User user) {
		return "add-user";
	}
	
	@GetMapping("/edituser")
	public String showEditUser(@RequestParam(name = "userId") Long id, Model model)
	{
		User user = userService.findUserById(id);
		model.addAttribute("user",user);
		return "edit-user";
	}

	@PostMapping("/adduser")
	public String addUser(@Valid User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-user";
		}
		userService.saveUser(user);
		return "redirect:/user";
	}
	
	@PostMapping("/updateuser")
	public String updateUser(@RequestParam(name = "userId") Long id, @Valid User user ,BindingResult result, Model model)
	{
		if(result.hasErrors())
		{
			user.setId(id);
			return "add-user";
		}
		userService.updateUser(user, id);
		return "redirect:/user";
	}
	
	@GetMapping("/deleteuser")
	public String deleteUser(@RequestParam(name = "userId") Long id, @Valid User user, BindingResult result, Model model)
	{
		userService.deleteUser(id);
		return "redirect:/user";
	}
}
