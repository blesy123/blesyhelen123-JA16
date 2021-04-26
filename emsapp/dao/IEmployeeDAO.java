package com.capg.emsapp.dao;
import java.util.List;

import com.capg.emsapp.beans.Employee;
//public class IEmployeeDAO {

	import java.util.HashMap;
	public interface IEmployeeDAO {
		public boolean insertEmployee(Employee e, String scheme);
		public	HashMap<Employee, String> getAllEmployees();
		public List<Employee> getAllEmployeesByScheme(String Scheme);
	}