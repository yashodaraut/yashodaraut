package com.technoelevate.springbootdatajpapratice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.technoelevate.springbootdatajpapratice.dto.EmployeeDto;
import com.technoelevate.springbootdatajpapratice.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/getEmp")
	public EmployeeDto getData(int eid) {

		return service.getData(eid);
	}
	
	@GetMapping("/getAll")
	public List<EmployeeDto> getAllData() {

		return service.getAllData();
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addData(@RequestBody EmployeeDto employee) {
		try {
			service.add(employee);
			return new ResponseEntity<>("Data added successfully", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public ResponseEntity<?> deleteEmp(@PathVariable("id") int eid) {
		try {
			service.delete(eid);
			return new ResponseEntity<>("Data Deleted",HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Data Deleted",HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	@PutMapping("/updateEmp")
	public ResponseEntity<?> updateEmp(@RequestBody EmployeeDto dto) {
		try {
			service.update(dto);
			return new ResponseEntity<>("Data updated",HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Data not updated",HttpStatus.INTERNAL_SERVER_ERROR);

		}
		
	}
	

}
