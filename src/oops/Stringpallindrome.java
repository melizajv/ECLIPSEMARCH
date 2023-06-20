package oops;

import java.util.Scanner;

public class Stringpallindrome {

	public static void main(String[] args) {
		String s="malayalam";
		String r="";
		

		for(int i=s.length()-1;i>=0;i--)
{
	r=r+s.charAt(i);
}
if(s.equals(r))
	{

 
	 System.out.println("pallindrome");
 }
 else
 {
	 System.out.println("not pallindrome");
	

 }
	}
	

	}
