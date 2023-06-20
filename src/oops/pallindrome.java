package oops;

import java.util.Scanner;

public class pallindrome 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r,s=0;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
			
		}
 System.out.println(s);
 if(s==temp)
 {
 
	 System.out.println("pallindrome");
 }
 else
 {
	 System.out.println("not pallindrome");
	

 }
	}
	}

