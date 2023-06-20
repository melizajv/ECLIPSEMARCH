package methods;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 3 numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Avg ob=new Avg();
		ob.avg(a,b,c);

	}
   public void avg(int a, int b, int c)
   {
	   int s=0,avg=0;
	   s=a+b+c;
	   avg=s/3;
       System.out.println("Average ="+avg);

   }
  
}
