package com.student.result.processing.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.result.processing.system.entity.CsdResults;

public interface CsdResultsRepository extends JpaRepository<CsdResults, Long> {

	List<CsdResults> findByStudentName(String studentname);

}
