package com.technoelevate.springbootdatajpapratice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoelevate.springbootdatajpapratice.dao.EmployeeDao;
import com.technoelevate.springbootdatajpapratice.dto.EmployeeDto;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public EmployeeDto getData(int id) {

		return dao.findByEid(id);
	}

	@Override
	public EmployeeDto add(EmployeeDto dto) {
		
		return dao.save(dto);
	}

	@Override
	public void delete(int eid) {
		EmployeeDto dto = dao.findByEid(eid);
		dao.delete(dto);
		
	}

	@Override
	public List<EmployeeDto> getAllData() {
		
		return (List<EmployeeDto>) dao.findAll();
	}

	@Override
	public EmployeeDto update(EmployeeDto dto) {
		return dao.save(dto);
		
	}

}
