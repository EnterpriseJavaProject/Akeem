package com.student.result.processing.system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.student.result.processing.system.entity.Users;
import com.student.result.processing.system.repository.UsersRepository;

@Service
public class UsersService {
	
	@Autowired
	public UsersRepository usersRepository;

	public List<Users> findAll() {
		return usersRepository.findAll();
	}

	public Page<Users> findAll(Integer page, Integer max) {
		return usersRepository.findAll(PageRequest.of(page - 1, max, Sort.by(Sort.Direction.DESC, "username")));
	}

	public boolean save(Users t) {
		try {
			usersRepository.save(t);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean saveAll(List<Users> t) {
		try {
			usersRepository.saveAll(t);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean delete(Users t) {
		try {
			usersRepository.delete(t);
			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public boolean deleteById(Long id) {
		try {

			usersRepository.deleteById(id);
			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public Optional<Users> findById(Long id) {
		return usersRepository.findById(id);
	}

	public Optional<Users> findByName(String name) {
		return usersRepository.findByUsername(name);
	}

	public Optional<Users> findByEmail(String email) {
		return usersRepository.findByEmail(email);
	}

	public List<Users> findById(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

}
