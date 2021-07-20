package com.student.result.processing.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.student.result.processing.system.entity.Users;
import com.student.result.processing.system.service.UsersService;

@Controller
public class MainController {
	
	@Autowired
	public UsersService userService;
	
	@GetMapping("/")
	public String index(Model model) {
		return "redirect:/adminprofiles";
	}
	
	@GetMapping("/adminprofile")
	public String admin(Model model) {
		List<Users> user = userService.findAll();
		model.addAttribute("user", user);
		return "index";
	}

}
