package com.capg.emsapp.dao;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.capg.emsapp.beans.Employee;
import com.capg.emsapp.customDB.EmployeeDB;

public class EmployeeDAOImpl implements IEmployeeDAO {
	//public class EmployeeDAOImpl implements IEmployeeDAO {

	HashMap<Employee, String> empList = EmployeeDB.emplist;

	public boolean insertEmployee(Employee e, String insuranceScheme){
		boolean isEmpInserted = EmployeeDB.addEmployee(e, insuranceScheme);
		empList = EmployeeDB.emplist;
		return isEmpInserted;
	}
	public HashMap<Employee, String> getAllEmployees(){
		return empList;
	}
	public List<Employee> getAllEmployeesByScheme(String Scheme){
		List<Employee> tempList = new ArrayList<Employee>();
		tempList.clear();
		for(Map.Entry<Employee, String> pair: empList.entrySet()) {
			if(pair.getValue().equals(Scheme)) {
				tempList.add(pair.getKey());
			}
			
		}
		return tempList;
		
	}
}
