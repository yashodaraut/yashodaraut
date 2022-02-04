package com.technoelevate.springbootdatajpapratice.dao;

import org.springframework.data.repository.CrudRepository;

import com.technoelevate.springbootdatajpapratice.dto.EmployeeDto;

public interface EmployeeDao extends CrudRepository<EmployeeDto, Integer>{
	public EmployeeDto findByEid(int id);
}
