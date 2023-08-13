package com.bktech.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bktech.security.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
	public Optional<Users> findByUsername(String username);
}
