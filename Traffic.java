package lab;

import java.util.Scanner;

public class Traffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Select the traffic lights");
		System.out.println(" RED AS: 1");
		System.out.println(" YELLOW AS: 2");
		System.out.println(" GREEN AS: 3");
		System.out.println("Select the traffic lights");
		
		int x = sc.nextInt();
		switch(x) {
		case 1: System.out.println("STOP!");
		break;
		case 2: System.out.println("READY");
		break;
		case 3: System.out.println("GO");
		break;
		default:System.out.println("INVALID"); 
	}

	}
}
