package com.ganesh.service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ganesh.entity.Employee;
import com.ganesh.repository.EmployeeRepository;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	
	private final EmployeeRepository employeeRepo;
	//private final JPAStreamer jpaStreamer;

	@Override
	public Employee createEmployee(Employee emp) {
		return employeeRepo.save(emp);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}
	
//	@Override
//	public List<Employee> saveEmployees(List<Employee> employees) {
//        return employeeRepo.saveAll(employees);
//    }
//
//	@Override
//    public List<Employee> getEmployees(int offset,int limit){
//        return jpaStreamer.stream(Employee.class)
//                .sorted(Employee$.name)
//                .skip(offset)
//                .limit(limit)
//                .collect(Collectors.toList());
//    }
//
//	@Override
//    public List<Employee> getEmployeesByDept(String dept){
//        return jpaStreamer.stream(Employee.class)
//                .filter(Employee$.dept.equal(dept))
//                .collect(Collectors.toList());
//    }
//
//	@Override
//    public List<Employee> getEmployeesByDeptAndSalary(String dept,double salary){
//        return jpaStreamer.stream(Employee.class)
//                .filter(Employee$.dept.equal(dept)
//                        .and(Employee$.salary.greaterOrEqual(salary)))
//                .collect(Collectors.toList());
//    }
//
//	@Override
//    public List<Employee> getEmployeeBySalaryRange(double salary1,double salary2){
//        return  jpaStreamer.stream(Employee.class)
//                .filter(Employee$.salary.between(salary1,salary2))
//                .collect(Collectors.toList());
//    }
//
//    //aggregate fun
//
//	@Override
//    public Employee minPaidEmp(){
//        return  jpaStreamer.stream(Employee.class)
//                .min(Comparator.comparing(Employee::getSalary)).get();
//    }
//
//	@Override
//    public List<Employee> getEmployeesByIds(List<Integer> ids){
//        return jpaStreamer.stream(Employee.class)
//                .filter(Employee$.id.in(ids))
//                .collect(Collectors.toList());
//    }
//
//	@Override
//    public Map<String, List<Employee>> getEmployeeGroupByDept(){
//        return jpaStreamer.stream(Employee.class)
//                .collect(Collectors.groupingBy(Employee::getDept));
//    }
//	

}
