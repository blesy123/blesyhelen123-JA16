package lab2;

import java.util.Scanner;

public class SecondNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, secNum;
		System.out.println("Enter the count of nuumbers: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int num[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the value of A[" + i + "]:");
			num[i] = sc.nextInt();
		}
		secNum = getSecondNumber(num);
		System.out.println("The second largest number is "+ secNum);

	}

	public static int getSecondNumber(int[] n) {
		int num1 = n[0], num2 = 0;
		for (int i = 0; i < n.length; i++) {
			
				if (n[i] >num1) {
                    num2=num1;
					num1 = n[i];

				}
		}
		return num2;
	}
	}

