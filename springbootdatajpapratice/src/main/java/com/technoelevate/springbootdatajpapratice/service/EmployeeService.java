package com.technoelevate.springbootdatajpapratice.service;

import java.util.List;

import com.technoelevate.springbootdatajpapratice.dto.EmployeeDto;

public interface EmployeeService {
	public EmployeeDto getData(int id);

	public EmployeeDto add(EmployeeDto dto);

	public void delete(int eid);

	public List<EmployeeDto> getAllData();

	public EmployeeDto update(EmployeeDto dto);

}
