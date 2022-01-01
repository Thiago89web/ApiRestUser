package com.thiago.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiago.spring.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
