package com.joaorodriguesdev.workshopmongoo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaorodriguesdev.workshopmongoo.domain.User;
import com.joaorodriguesdev.workshopmongoo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
