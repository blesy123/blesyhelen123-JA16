package p2;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1=new int[5] ;
		int[] ar2=new int[5] ;
		arrayInsertion(ar1);
		secondArrayInsertion(ar1,ar2);
		arryPrint(ar1,ar2);
	}

	public static void arryPrint(int[] ar1,int[] ar2)
	{
		 System.out.println("value of first array:");
		
		for(int i=0;i<5;i++)
		{
		 System.out.print(ar1[i]+"\t");
		  
		}
		System.out.println("\n Before removing duplicate element array are :");

		/* Loop for displaying array elements */
		for(int i=0;i<5;i++)
		{
		 System.out.print(ar1[i]+"\t");
		  
		}
		 System.out.println("\n Value of second array after removing Duplicate elements:");
		for(int y=0;y<5;y++)
		{
		 System.out.print(ar2[y]+"\t");
		  
		}
	}
	public static void arrayInsertion(int[] ar)
	{
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			
		  System.out.println("Please enter value of A["+i+"]");
		  ar[i]=Integer.parseInt(sc.nextLine());
		}
	}

	public static void secondArrayInsertion(int[] ar1,int[] ar2)
	{
		int flag=0,pos=0;
		for(int i=0;i<5;i++)
		{
			for(int y=0;y<5;y++)
			{
			  if(ar1[i]==ar2[y])
			  {
				  flag=1;
				  break;
			  }
			}
			if (flag==0)
			{
				ar2[pos]=ar1[i];
				pos++;
			}
			else {
				flag=0;
			}
			
		}
	}
}
