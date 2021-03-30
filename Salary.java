package p1;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the salary");
		Scanner sc=new Scanner(System.in);
		double bsal=sc.nextInt();
		double tax=0;
		double HRA= 0.4*bsal;
	double DA=0.6*bsal;
		double sal=bsal+HRA+DA;
		if(sal < 200000)
		{
			tax = 0;
	}
	else if(sal >= 200000 && sal <=600000) {
		tax = 0.1 * sal;
	}
	else if(sal > 600000) {
		tax = 0.2 * sal;
	}
	double totalSal = sal - tax;
	System.out.print("The Annual Salary for the employee is: " + totalSal + 
			"\nThe Annual Tax is: " + tax + "\n");
	

		}

		
	}


