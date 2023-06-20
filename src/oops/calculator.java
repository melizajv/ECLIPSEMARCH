package oops;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args)
	{
		System.out.println("enter two numbers");
	
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the choice 1.add 2.sub 3.mul 4.div");
		int choice=sc.nextInt();
		double result=0;
		
			switch(choice)
			{
			case 1:result=a+b;
			break;
			case 2:result=a-b;
			break;
			case 3:result=a*b;
			break;
			case 4:
			if(b==0)
			{
				System.out.println("Error");
			}
			
			else
				{
					System.out.println("Result="+a/b);
				}
			break;
			default:System.out.println("Invalid choice");
			
		}
		System.out.println("Result ="+result);
	}

}
