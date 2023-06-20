package oops;

import java.util.Scanner;

public class reverseusingscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int s=0,r;
		while(m>0)
		{
			r=m%10;
			s=s*10+r;
			m=m/10;
		}
System.out.println(s);
	}

}
