package com.capg.emsapp.service;
import java.util.List;
import java.util.HashMap;
import com.capg.emsapp.beans.Employee;
import com.capg.emsapp.exceptions.EmployeeSalaryException;
//public class IEmployeeService {
	public interface IEmployeeService {
		
			public boolean insertEmployee(Employee e, String scheme);
			public HashMap<Employee, String> getAllEmployees();
			public List<Employee> getAllEmployeesByScheme(String Scheme);
		}
		

