package com.student.result.processing.system.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.result.processing.system.entity.LecturerProfile;

public interface LecturerProfileRepository extends JpaRepository<LecturerProfile, Long> {

	List<LecturerProfile> findByName(String name);

	Optional<LecturerProfile> findByEmail(String email);

}
