package com.capg.app.ui;
import java.util.List;
import java.util.Scanner;

import com.capg.app.beans.Instructor;
import com.capg.app.service.InstructorService;
import com.capg.app.service.InstructorServiceImpl;
public class MainClass {
	InstructorService service;
	public MainClass() {
		service = new InstructorServiceImpl();
	}
	
	public static void main(String[] args) {
		MainClass obj = new MainClass();
		
		
		while(true)
		{
			
			System.out.println("1. Insert");
			System.out.println("2. Show All");
			System.out.println("3. Get Instructor By Code");
			System.out.println("4. Get Instructors By Location");
			System.out.println("5. Get Instructors By Salary");
			System.out.println("0. EXIT");
			
		
			
			int opt =new Scanner(System.in).nextInt(); 
			
			
			if(opt == 1)
			{
				obj.insertInstructorDetailsFromUser();
			}
			if(opt == 2)
			{
				
				obj.readInstructorDetails();
			}
			if(opt == 3) {
				obj.getInstructorByCode();
			}
			if(opt == 4) {
				obj.getInstructorsByLocation();
			}
			if(opt == 5) {
				obj.getInstructorsBySalary();
			}
			if(opt == 0)
			{
				System.exit(0);
			}
			
			
		}
		
		
	}//end main
	
	public void insertInstructorDetailsFromUser()
	{
		
		// ... write code to read data hope 
		Instructor instructor = new Instructor(130, "X", 7000, 2000, "x@x.com", "B");
		try {
			boolean result = service.insertInstructor(instructor);
			
			if(result) System.out.println(" Instructor Added");
			else System.out.println("Contact Admin ...");
		} catch (Exception e) {
			showErr(e);
		}
		
		
	}
	public void readInstructorDetails()
	{
		
		try
		{
			List<Instructor> list = service.getInstructors() ;
			
			list.stream().forEach(instructor->displayInstructor(instructor));
		}
		catch(Exception e)
		{
			showErr(e);
		}
	
	}
	
	public void displayInstructor(Instructor instructor)
	{
		
		System.out.println(instructor);
		System.out.println("-------------------------------------------------------");
	}
	public void showErr(Exception e)
	{
		System.out.println("====>> "+e);
	}
	
	//get instructor by code 
	public void getInstructorByCode() {
		System.out.println("Enter code: ");
		int code = new Scanner(System.in).nextInt(); 
		try {
			Instructor instructor = service.getInstructorByCode(code);
			System.out.println(instructor);
			
		}catch(Exception e)
		{
			showErr(e);
		}
		
	}
	
	//get instructors by location 
	public void getInstructorsByLocation() {
		System.out.println("Enter location: ");
		String location = new Scanner(System.in).nextLine(); 
		try {
			List<Instructor> list = service.getInstructorsByLocation(location);
			list.stream().forEach(instructor->displayInstructor(instructor));
			
		}catch(Exception e)
		{
			showErr(e);
		}
		
	}
	
	// get instructors by salary
	public void getInstructorsBySalary() {
		System.out.println("Enter salary: ");
		int salary = new Scanner(System.in).nextInt(); 
		try {
			List<Instructor> list = service.getInstructorsBySalary(salary);
			list.stream().forEach(instructor->displayInstructor(instructor));
			
		}catch(Exception e)
		{
			showErr(e);
		}
		
	}
}
