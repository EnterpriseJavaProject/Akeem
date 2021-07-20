package com.student.result.processing.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.result.processing.system.entity.LecturerProfile;
import com.student.result.processing.system.repository.LecturerProfileRepository;

@Controller
@RequestMapping("/lecturer")
public class LecturerProfileController {
	
	@Autowired
	LecturerProfileRepository lecturerRepos;
	
	
	@PostMapping("/saveLecturer")
	public LecturerProfile saveAdmin(@RequestBody LecturerProfile lecturer) {
		return lecturerRepos.save(lecturer);
	}
	
	
	@PutMapping("updateLecturer")
	public LecturerProfile updateAdmin(@RequestBody LecturerProfile lecturer) {
		return lecturerRepos.save(lecturer);
	}
	
	@GetMapping("/getAllLecturer")
	public List<LecturerProfile> getAllLecturer(){
		return lecturerRepos.findAll();
	}
	
	@DeleteMapping("/delete{id}")
	public void deleteLecturer(@PathVariable ("id") Long id) {
		lecturerRepos.findById(id);
	}

}
