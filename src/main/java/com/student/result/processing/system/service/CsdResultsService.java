package com.student.result.processing.system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.student.result.processing.system.entity.CsdResults;
import com.student.result.processing.system.repository.CsdResultsRepository;

@Service
public class CsdResultsService {

	@Autowired
	public CsdResultsRepository csdResultsRepository;

	public List<CsdResults> findAll() {
		return csdResultsRepository.findAll();
	}

	public Page<CsdResults> findAll(Integer page, Integer max) {
		return csdResultsRepository.findAll(PageRequest.of(page - 1, max, Sort.by(Sort.Direction.DESC, "name")));
	}

	public boolean save(CsdResults t) {
		try {
			csdResultsRepository.save(t);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean saveAll(List<CsdResults> t) {
		try {
			csdResultsRepository.saveAll(t);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean delete(CsdResults t) {
		try {
			csdResultsRepository.delete(t);
			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public boolean deleteById(Long id) {
		try {

			csdResultsRepository.deleteById(id);
			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public Optional<CsdResults> findById(Long id) {
		return csdResultsRepository.findById(id);
	}

	public List<CsdResults> findByStudentName(String studentname) {
		return csdResultsRepository.findByStudentName(studentname);
	}

	

}
