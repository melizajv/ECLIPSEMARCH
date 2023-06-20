package array;

import java.util.Scanner;

public class Singledimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int[] ar=new int[3];
		//ar[0]=25;
		//ar[1]=50;
		//ar[2]=45;
		//System.out.println(ar[1]);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		for(int i=0;i<3;i++)
		{
		
		
		ar[i]=sc.nextInt();
		}
		System.out.println("Entered numbers are");
		//to print all values together
		for(int i=0;i<3;i++)
		{
			System.out.println(ar[i]);
		}
	}

}
