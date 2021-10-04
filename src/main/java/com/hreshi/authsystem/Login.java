package com.hreshi.authsystem;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class Login {
	
	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}

	@PostMapping("/login")
	public String login(@RequestParam(name="username")String username, @RequestParam(name="password") String password, Model model) {
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		return "login";
	}
}