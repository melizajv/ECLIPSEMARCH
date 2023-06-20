package oops;

import java.util.Scanner;

public class scannersum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter first number=");
	

		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Enter second number=");
		int b=s.nextInt();
		int sum=a+b;
		
		System.out.println("Sum="+sum);

	}

}
