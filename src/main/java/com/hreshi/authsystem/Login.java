package com.hreshi.authsystem;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class Login {
	
	@GetMapping("/")
	public String login() {
		return "login";
	}

	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}

	@PostMapping("/login")
	public String login(@RequestParam(name="username")String username, @RequestParam(name="password") String password, Model model) {
		Users user = new Users();
		if(user.validateUser(username, password)) {
			model.addAttribute("result", "yes it worked!");
		} else {
			model.addAttribute("result", "did not worked!");
		}
		return "login";
	}
}