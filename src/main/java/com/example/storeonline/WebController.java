package com.example.storeonline;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping("/profile")
	public String profile(Model model)
	{
		List<Info> profile = new ArrayList<>();
		profile.add(new Info("fullname", "David"));
		profile.add(new Info("nickname", "david"));
		profile.add(new Info("gmail", "david@gmail.com"));
		profile.add(new Info("facebook", "https://www.facebook.com/david."));
		
		model.addAttribute("lodaProfile", profile);
		
		return "profile";
	}
	
}
