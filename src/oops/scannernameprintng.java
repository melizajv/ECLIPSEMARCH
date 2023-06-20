package oops;

import java.util.Scanner;

public class scannernameprintng {
public static void main(String[] args)
{
	System.out.println("Enter your name");
	Scanner sc1= new Scanner(System.in);
	String s=sc1.next();
	//string with space-- nextline()
	//for char-
	//char c=sc1.next().charAt(2);//3rd letter of name will be printed
	System.out.println("My name is "+s);
}
}
