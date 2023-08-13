package com.bktech.security.service;

import java.util.Optional;

import com.bktech.security.entity.Users;

public interface IUserService {
	Integer saveUser(Users user);
	Optional<Users> findByUsername(String username);
}
