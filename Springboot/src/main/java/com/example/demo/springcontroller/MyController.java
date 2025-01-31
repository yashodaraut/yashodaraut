package com.example.demo.springcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.servicGGG;

@RestController
@RequestMapping("/api/v1")
public class MyController {
	@Autowired
	servicGGG s;

	@PostMapping("/in")
	public ResponseEntity<Employee> meth(@RequestBody Employee employee){
		Employee emp=s.inserting(employee);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		
	}
	
	@PostMapping("/del")
	public void dell(@RequestParam Integer id,Employee emp)
	{
		s.delete(emp);
	}
	@PutMapping("/upd")
	public ResponseEntity<Employee> upddd(@RequestBody Employee employee){
		Employee emp=s.updatee(employee);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		
	}
	@GetMapping("/get")
	public ResponseEntity<List<Employee>>gettt(){
		return new ResponseEntity<List<Employee>>(s.getall(),HttpStatus.OK);

				
	
	}
	@GetMapping("/getid")
	public ResponseEntity<List<Employee>>getttid(@RequestParam Integer id,Employee emp){
		return new ResponseEntity<List<Employee>>(s.getalll(id),HttpStatus.OK);

				
	
	}
	}
	

