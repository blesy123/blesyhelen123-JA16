package lab;

import java.util.Scanner;

public class Increasing {
	public static boolean Increase(int x)
	{
	       boolean key = false;
	        
	    
	       int currentDigit = x % 10;
	       x = x/10;
	        
	      
	       while(x>0){
	         
	           if(currentDigit <= x % 10){
	               key = true;
	               break;
	           }

	           currentDigit = x % 10;
	           x = x/10;
	       }
	       
	       if(key)
	           return false;
	       else
	            return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number=");
		int k = sc.nextInt();
		boolean m = Increase(k);
		if(m)
			System.out.println("Increasing");
		else
			System.out.println("Not Increasing");
	}

}
