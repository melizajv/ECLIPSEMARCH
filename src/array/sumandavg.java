package array;

import java.util.Scanner;

public class sumandavg {
public static void main(String[] args)
{

	int a[]=new int[5];
	System.out.println("Enter the numbers");

	Scanner sc = new Scanner(System.in);
	for(int i=0;i<=5;i++)
	{
		a[i]=sc.nextInt();

	}
	int s=0;
	for(int v:a)
	{
		s=s+v;
	}
	System.out.println("sum="+s);
	
		
	}
}

