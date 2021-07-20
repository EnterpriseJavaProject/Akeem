package com.student.result.processing.system.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.result.processing.system.entity.StudentProfile;

public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long> {

	List<StudentProfile> findByStudentName(String name);

	Optional<StudentProfile> findByEmail(String email);

}
