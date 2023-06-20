package array;

import java.util.Scanner;

public class stringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Enter the names");
   Scanner sc=new Scanner(System.in);
   String a[]=new String[5];
   for(int i=0;i<=4;i++)
   {
	   a[i]=sc.next();
	   
   }
   System.out.println("Names are");
   {
	   for(int i=0;i<=4;i++)
	   {
		   System.out.println(a[i]);
	   
	   //for(String v:a)//for-if loop
	   //{
		//   System.out.println(v);
	   }
   }
	}

}
