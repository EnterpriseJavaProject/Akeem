package com.student.result.processing.system.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.result.processing.system.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

	Optional<Users> findByUsername(String name);

	Optional<Users> findByEmail(String email);

}
