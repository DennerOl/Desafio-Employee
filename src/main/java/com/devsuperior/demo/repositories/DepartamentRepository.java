package com.devsuperior.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.demo.entities.Department;

public interface DepartamentRepository extends JpaRepository<Department, Long> {

}
