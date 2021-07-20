package com.student.result.processing.system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.student.result.processing.system.entity.LecturerProfile;
import com.student.result.processing.system.repository.LecturerProfileRepository;

@Service
public class LecturerProfileService {
	
	@Autowired
	public LecturerProfileRepository lecturerProfileRepository;
	
	public List<LecturerProfile> findAll() {
		return lecturerProfileRepository.findAll();
	}
	
	public Page<LecturerProfile> findAll(Integer page, Integer max) {
		return lecturerProfileRepository.findAll(PageRequest.of(page - 1, max, Sort.by(Sort.Direction.DESC, "name")));
	}

	public boolean save(LecturerProfile t) {
		try {
			lecturerProfileRepository.save(t);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean saveAll(List<LecturerProfile> t) {
		try {
			lecturerProfileRepository.saveAll(t);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean delete(LecturerProfile t) {
		try {
			lecturerProfileRepository.delete(t);
			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public boolean deleteById(Long id) {
		try {

			lecturerProfileRepository.deleteById(id);
			return true;

		} catch (Exception e) {
			return false;
		}

	}
	
	public Optional<LecturerProfile> findById(Long id) {
		return lecturerProfileRepository.findById(id);
	}

	public List<LecturerProfile> findByName(String name) {
		return lecturerProfileRepository.findByName(name);
	}

	public Optional<LecturerProfile> findByEmail(String email) {
		return lecturerProfileRepository.findByEmail(email);
	}

}
