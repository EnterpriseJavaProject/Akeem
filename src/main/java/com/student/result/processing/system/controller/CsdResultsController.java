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

import com.student.result.processing.system.entity.CsdResults;
import com.student.result.processing.system.repository.CsdResultsRepository;

@Controller
@RequestMapping("/csdResults")
public class CsdResultsController {
	
	@Autowired
	CsdResultsRepository resultsRepos;
	
	
	@PostMapping("/saveResults")
	public CsdResults saveResults(@RequestBody CsdResults results) {
		return resultsRepos.save(results);
	}
	
	
	@PutMapping("updateResults")
	public CsdResults updateResults(@RequestBody CsdResults results) {
		return resultsRepos.save(results);
	}
	
	@GetMapping("/getAllResults")
	public List<CsdResults> getAllResults(){
		return resultsRepos.findAll();
	}
	
	@DeleteMapping("/delete{id}")
	public void deleteResults(@PathVariable ("id") Long id) {
		resultsRepos.findById(id);
	}

}
