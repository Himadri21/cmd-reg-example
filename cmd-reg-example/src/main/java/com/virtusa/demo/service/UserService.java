package com.virtusa.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.virtusa.demo.model.User;
import com.virtusa.demo.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

	User findByEmail(String email);
	
	User save(UserRegistrationDto registration);
}
