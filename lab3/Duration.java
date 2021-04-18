package lab3;

import java.util.Scanner;
import java.time.*;

public class Duration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("enter date in the format of yyyy mm dd");
  	   Scanner sc=new Scanner(System.in);
  	   int y=sc.nextInt();
  	   int m=sc.nextInt();
  	   int d=sc.nextInt();
         LocalDate givendate = LocalDate.of(y, m, d);
         LocalDate presentdate = LocalDate.now();
         sc.close();
         Period diff = Period.between(givendate, presentdate);
         System.out.printf("Difference is\n "+diff.getYears()+" Years: "+diff.getMonths()+" Months: "+diff.getDays()+" Days");
	    
	}
	}

