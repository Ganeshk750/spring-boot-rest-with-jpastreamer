package com.ganesh.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.entity.Employee;
import com.ganesh.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class EmployeeController {
	
	private final EmployeeService empService;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> createNewEmployee(@RequestBody Employee emp){
		return new ResponseEntity<Employee>(empService.createEmployee(emp), HttpStatus.CREATED);
	}
	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		return new ResponseEntity<List<Employee>>(empService.getAllEmployee(), HttpStatus.OK);
	}

}
