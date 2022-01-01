package com.thiago.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiago.spring.entities.User;
import com.thiago.spring.repository.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<User> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public User findAll(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping
	public User insert(@RequestBody User user) {
		return repository.save(user);
	}
	
	@PutMapping(value = "/{id}")
	public User update(@RequestBody User user, @PathVariable Long id) {
		return repository.save(user);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
