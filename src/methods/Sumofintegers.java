package methods;

import java.util.Scanner;

public class Sumofintegers {
	
	public int Sumofintegers(int a)
	{
		int r=0,s=0;
		
		while(a>0)
		{
	r=a%10;
	s=s+r;
	a=a/10;
	}
		return s;
	}
	public void display()
	{
	System.out.println("Sum of integers="+sum);
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
   System.out.println("Enter the number");
   Scanner sc= new Scanner(System.in);
   
   int a=sc.nextInt();
   Sumofintegers s= new Sumofintegers();
   int sum =s.Sumofintegers(a);
   System.out.println("Sum of integers="+s);
  
  
	}
}
