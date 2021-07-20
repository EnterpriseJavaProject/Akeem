package com.student.result.processing.system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.student.result.processing.system.entity.StudentProfile;
import com.student.result.processing.system.repository.StudentProfileRepository;


@Service
public class StudentProfileService {

	@Autowired
	public StudentProfileRepository studentProfileRepository;

	public List<StudentProfile> findAll() {
		return studentProfileRepository.findAll();
	}

	public Page<StudentProfile> findAll(Integer page, Integer max) {
		return studentProfileRepository.findAll(PageRequest.of(page - 1, max, Sort.by(Sort.Direction.DESC, "name")));
	}

	public boolean save(StudentProfile t) {
		try {
			studentProfileRepository.save(t);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean saveAll(List<StudentProfile> t) {
		try {
			studentProfileRepository.saveAll(t);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean delete(StudentProfile t) {
		try {
			studentProfileRepository.delete(t);
			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public boolean deleteById(Long id) {
		try {

			studentProfileRepository.deleteById(id);
			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public Optional<StudentProfile> findById(Long id) {
		return studentProfileRepository.findById(id);
	}

	public List<StudentProfile> findByStudentName(String name) {
		return studentProfileRepository.findByStudentName(name);
	}

	public Optional<StudentProfile> findByEmail(String email) {
		return studentProfileRepository.findByEmail(email);
	}

}
