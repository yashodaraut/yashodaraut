package com.example.demo.daolayer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employee;

public interface DaoLayer extends JpaRepository<Employee, Integer> {



	
	
}
