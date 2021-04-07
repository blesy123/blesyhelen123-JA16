package lab;

import java.util.Scanner;

public class Difference {
	public static int calculateDifference(int n)
	{
		int diff = 0;
		int sum1=0;
		int sum2=0;
		int sum3=0;
		for(int i=1;i<=n;i++) 
		{
			sum1+=i*i;
			sum2+=i;
		}
		sum3=sum2*sum2;
		diff=sum1-sum3;
		return diff;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number=");
		int k = sc.nextInt();
		System.out.println("Difference is ---->");
        System.out.println(Math.abs(calculateDifference(k)));
	}

}
