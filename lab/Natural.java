package lab;

import java.util.Scanner;

public class Natural {
	public static int Sum(int n)
	{ int sum=0;
		for(int i=1; i<=n;i++)
		{
			if(i%3==0 || i%5==0)
				sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number-->\n");
		int k = sc.nextInt();
		System.out.println("The Sum of Number Divisible by 3or5=\n"+Sum(k));
		
	}

}
