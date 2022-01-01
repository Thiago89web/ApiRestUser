package com.thiago.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiago.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
