package com.student.result.processing.system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import com.student.result.processing.system.entity.AdminProfile;
import com.student.result.processing.system.repository.AdminProfileRepos;

@Service
public class AdminProfileService {
	
	@Autowired
	public AdminProfileRepos adminProfileRepos;
	
	public List<AdminProfile> findAll() {
		return adminProfileRepos.findAll();
	}
	
	public Page<AdminProfile> findAll(Integer page, Integer max) {
		return adminProfileRepos.findAll(PageRequest.of(page - 1, max, Sort.by(Sort.Direction.DESC, "name")));
	}

	public boolean save(AdminProfile t) {
		try {
			adminProfileRepos.save(t);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean saveAll(List<AdminProfile> t) {
		try {
			adminProfileRepos.saveAll(t);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean delete(AdminProfile t) {
		try {
			adminProfileRepos.delete(t);
			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public boolean deleteById(Long id) {
		try {

			adminProfileRepos.deleteById(id);
			return true;

		} catch (Exception e) {
			return false;
		}

	}
	
	public Optional<AdminProfile> findById(Long id) {
		return adminProfileRepos.findById(id);
	}

	public List<AdminProfile> findByName(String name) {
		return adminProfileRepos.findByName(name);
	}

	public Optional<AdminProfile> findByEmail(String email) {
		return adminProfileRepos.findByEmail(email);
	}

}
