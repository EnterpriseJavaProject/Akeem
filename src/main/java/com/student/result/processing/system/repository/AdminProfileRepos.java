package com.student.result.processing.system.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.result.processing.system.entity.AdminProfile;


public interface AdminProfileRepos extends JpaRepository<AdminProfile, Long> {

	List<AdminProfile> findByName(String name);

	Optional<AdminProfile> findByEmail(String email);

}
