package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.pl.Service;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
		
		Service e1 = new Service();
		
		while(true) {
		System.out.println("Enter ID Number of Employee");
		int id = sc.nextInt();
		e1.setId(id);
		
		System.out.println("Enter First Name of Employee");
		String name = sc.next();
		e1.setName(name);
		
		System.out.println("Enter Salary of Employee");
		double salary = sc.nextDouble();
		e1.setSalary(salary);
		
		System.out.println("Enter Designation of Employee");
		String designation = sc.next();
		e1.setDesignation(designation);
		System.out.println("_____________________________________________________________");
		
		e1.displayDetails();
		System.out.println("Insurance Policy: ");
		e1.findInsScheme(salary);
		System.out.println("_____________________________________________________________");
		
		}
		
	}
	}


