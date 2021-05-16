package com.capg.app.service;
import java.sql.SQLException;
import java.util.List;

import com.capg.app.beans.Instructor;
import com.capg.app.dao.InstructorDAO;
import com.capg.app.dao.InstructorDAOImpl;
import com.capg.app.dto.InstructorsLocationCountDTO;
import com.capg.app.exception.InstructorNotFoundException;

public class InstructorServiceImpl  implements InstructorService {

	InstructorDAO dao;
	
	public InstructorServiceImpl() {
		dao = new InstructorDAOImpl();
	}

	
	public boolean insertInstructor(Instructor instructor)throws SQLException {
		
		boolean isQueryExecuted = false;
		
		// --- call business Server side validations
		
		// call Security layer 
		
		isQueryExecuted = dao.insertInstructor(instructor);
		
		// call Logger task
		
		return isQueryExecuted;
	}

	
	public Instructor getInstructorByCode(int code) throws InstructorNotFoundException,SQLException {
		Instructor instructor = dao.getInstructorByCode(code);
		return instructor;
	}


	public List<Instructor> getInstructors() throws SQLException{
		
		return dao.getInstructors();
	}

	
	public List<Instructor> getInstructorsByLocation(String location) throws SQLException {
		// TODO Auto-generated method 
		return dao.getInstructorsByLocation(location);
	}

	
	public List<InstructorsLocationCountDTO> getInstructorsCountByLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Instructor> getInstructorsBySalary(int salary) throws SQLException{
		
		return dao.getInstructorsBySalary(salary);
	}

	
	public boolean delteInstructorByCode(int code) throws InstructorNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	public Instructor updateInstructor(Instructor oldInfoInstructor) {
		
		return null;
	}

}
