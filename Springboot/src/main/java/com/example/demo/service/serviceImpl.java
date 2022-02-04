package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.daolayer.DaoLayer;
import com.example.demo.model.Employee;
@Service
public class serviceImpl implements servicGGG{
	@Autowired
	DaoLayer d;

	public Employee inserting(Employee employee) {
		
		if(employee!=null) {

		
		return d.save(employee);
	} throw new RuntimeException("not inserting");
		}

	@Override
	public void delete(Employee emp) {
		int id=emp.getId();
		if(id<0) {
			throw new RuntimeException("dellllnoo");
		}
		d.delete(emp);
	
	}


	@Override
	public Employee updatee(Employee emp) {
		int id=emp.getId();
		if(id<0) {
			throw new RuntimeException("uupdddnonnoo");
		}
		return d.save(emp);
	}

	@Override
	public List<Employee> getall() {
		List<Employee> findAll = d.findAll();
				return findAll;
	}

	@Override
	public List<Employee> getalll(Integer id) {
		List<Employee> findAll = d.findAll();

		return findAll;
	}


}
