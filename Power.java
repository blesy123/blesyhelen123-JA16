package lab;

import java.util.Scanner;

public class Power {
	public static boolean Power(int n)
	{
		while(n%2==0)
		{
			n=n/2;
		}
		if(n==1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number=");
		int k = sc.nextInt();
		boolean m = Power(k);
		if(m)
			System.out.println("Power of 2");
		else
			System.out.println("Not a Power of 2");
	}
	}


