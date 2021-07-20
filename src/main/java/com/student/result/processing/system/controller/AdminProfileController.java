package com.student.result.processing.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.student.result.processing.system.entity.AdminProfile;
import com.student.result.processing.system.service.AdminProfileService;

@Controller
public class AdminProfileController {

	@Autowired
	AdminProfileService adminProfileService;

	// this Admin index method will list the Admins
	@GetMapping("/adminprofiles")
	public String index(Model model) {
	List<AdminProfile> listAdmins = adminProfileService.findAll();
	//pass the list of Admins to the model
	model.addAttribute("listAdmins", listAdmins);
	
	return "adminprofile";
	}

	@PostMapping("/saveAdmin")
	public boolean saveAdmin(@RequestBody AdminProfile admin) {
		return adminProfileService.save(admin);
	}

	@PutMapping("updateAdmin")
	public boolean updateAdmin(@RequestBody AdminProfile admin) {
		return adminProfileService.save(admin);
	}

	@GetMapping("/getAllAdmin")
	public List<AdminProfile> getAllAdmin() {
		return adminProfileService.findAll();
	}

	@DeleteMapping("/delete{id}")
	public void deleteAdmin(@PathVariable("id") Long id) {
		adminProfileService.findById(id);
	}

}
