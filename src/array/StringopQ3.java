package array;

import java.util.Scanner;

public class StringopQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     System.out.println("Enter the name");

     Scanner sc= new Scanner(System.in);
     String s=sc.next();
		int count=0;

     for (int i=0;i<s.length();i++)
     {
    	 char ch=s.charAt(i);
    	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    	 {
    		 count++;
    	 } 
    	 }
    	 System.out.println("number of vowels="+count);
     }
	}


