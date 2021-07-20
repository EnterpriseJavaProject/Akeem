package com.student.result.processing.system.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.result.processing.system.entity.Role;
import com.student.result.processing.system.entity.Users;
import com.student.result.processing.system.service.UsersService;

@Controller
public class UsersController {
	
	@Autowired
	public UsersService usersService;
	
	@Autowired
	public PasswordEncoder encoder;
	
	@GetMapping("/users")
	public String Users(Model model) {
		List<Users> users = usersService.findAll();
		model.addAttribute("users", users);
		return "users";
	}

	// we are using responsebody to get a jason fill for us
	@ResponseBody
	@GetMapping("/findById")
	public List<Users> findByuserId(Long id) {
		// searching for user using id
		Optional<Users> oppuser = usersService.findById(id);
		// If the user is find in the database
		if (oppuser.isPresent()) {
			Users user = oppuser.get();
			List<Users> result = usersService.findById(user);

			return result;
		}

		return new ArrayList<>();
	}

	@ResponseBody
	@PostMapping("/createUser")
	public String createUsers(String accessLevel, String email, String password, String username, String name) {

		Users user = new Users();
		user.setAccessLevel(accessLevel);
		user.setActive(false); // This is use to flag the user to make it active or inactive
		user.setEmail(email);
		user.setPassword(encoder.encode(password));
		user.setUsername(username);
		user.setLocked(false);

		// setting user role
		List<Role> role = new ArrayList<>(); // array list of role the user is to have
		Role rol = new Role();  //instantiating a role
		rol.setName(name);  // given the role a name
		role.add(rol); // added the role created to the list
		
		user.setRoles(role); // add the user to the list

		return usersService.save(user) ? "SUCCESS" : "FAILED";// ternary operator//when call one the save method,
		// if should return success if everything is good, otherwise, return failed.
	}

}


