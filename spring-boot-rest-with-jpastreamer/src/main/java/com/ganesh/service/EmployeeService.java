package com.ganesh.service;

import java.util.List;
import java.util.Map;

import com.ganesh.entity.Employee;

public interface EmployeeService {
	
	public Employee createEmployee(Employee emp);
	public List<Employee> getAllEmployee();
//	public List<Employee> saveEmployees(List<Employee> employees);
//	public List<Employee> getEmployees(int offset,int limit);
//	public List<Employee> getEmployeesByDept(String dept);
//	public List<Employee> getEmployeesByDeptAndSalary(String dept,double salary);
//	public List<Employee> getEmployeeBySalaryRange(double salary1,double salary2);
//	public Employee minPaidEmp();
//	public List<Employee> getEmployeesByIds(List<Integer> ids);
//	public Map<String, List<Employee>> getEmployeeGroupByDept();

}
