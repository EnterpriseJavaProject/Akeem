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

import com.student.result.processing.system.entity.StudentProfile;
import com.student.result.processing.system.repository.StudentProfileRepository;

@Controller
@RequestMapping("/student")
public class StudentProfileController {
	
	@Autowired
	StudentProfileRepository studentRepos;
	
	
	@PostMapping("/saveStudent")
	public StudentProfile saveStudent(@RequestBody StudentProfile student) {
		return studentRepos.save(student);
	}
	
	
	@PutMapping("updateStudent")
	public StudentProfile updateStudent(@RequestBody StudentProfile student) {
		return studentRepos.save(student);
	}
	
	@GetMapping("/getAllStudent")
	public List<StudentProfile> getAllStudent(){
		return studentRepos.findAll();
	}
	
	@DeleteMapping("/delete{id}")
	public void deleteStudent(@PathVariable ("id") Long id) {
		studentRepos.findById(id);
	}

}
