package p1;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.print("Enter marks in English");
		Scanner sc=new Scanner(System.in);
		int english=sc.nextInt();
		System.out.print("Enter marks in Java\n");
		int java=sc.nextInt();
		System.out.print("Enter marks in DB\n");
		int db=sc.nextInt();
		System.out.print("Enter marks in Springsuite\n");
		int springsuite=sc.nextInt();
		int totalmarks=english+java+db+springsuite;
		int avg=english+java+db+springsuite/4;
		System.out.print("The total marks of the student is:"+totalmarks);
		System.out.print("\nThe average marks of the student is:"+avg);
		
	}

}
