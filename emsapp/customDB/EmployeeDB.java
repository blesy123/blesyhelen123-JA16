package com.capg.emsapp.customDB;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import com.capg.emsapp.beans.Employee;

public class EmployeeDB {
	public static HashMap<Employee, String> emplist = new HashMap<Employee, String>();

	public static boolean addEmployee(Employee e, String insuranceScheme) {
		return emplist.put(e, insuranceScheme) != null;
}
}