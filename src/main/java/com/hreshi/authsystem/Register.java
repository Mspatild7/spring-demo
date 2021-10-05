package com.hreshi.authsystem;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

public class Register {

	@GetMapping("/register")
	public String register(Model model) {
		return "register";
	}

	@PostMapping("/register")
	public String register(@RequestParam(name="username")String name, @RequestParam(name="password") String pass, Model model) {
		Users user = new Users();
		if(user.registerUser(name, pass)) {
			model.addAttribute("result", "register success!");
		} else {
			model.addAttribute("result", "failure! user already exists");
		}
		return "register";
	}
}