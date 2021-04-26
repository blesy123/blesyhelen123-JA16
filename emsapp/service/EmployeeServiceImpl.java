package com.capg.emsapp.service;
import java.util.List;
import java.util.HashMap;
import com.capg.emsapp.beans.Employee;
import com.capg.emsapp.dao.EmployeeDAOImpl;
import com.capg.emsapp.dao.IEmployeeDAO;
import com.capg.emsapp.exceptions.EmployeeSalaryException;
//public class EmployeeServiceImpl {
public class EmployeeServiceImpl implements IEmployeeService{
	IEmployeeDAO dao;
	public EmployeeServiceImpl() {
		dao = new EmployeeDAOImpl();
		// Animal a = new Dog();
	}
	public boolean insertEmployee(Employee e, String scheme) {
		boolean isInserted = dao.insertEmployee(e, scheme);
		return isInserted;
	}
public HashMap<Employee, String> getAllEmployees() {
		
		return dao.getAllEmployees();
	}
public List<Employee> getAllEmployeesByScheme(String scheme) {
	
	return dao.getAllEmployeesByScheme(scheme);
}
}
	
