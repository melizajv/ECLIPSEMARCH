package oops;

import java.util.Scanner;

interface bank
{
	public void showdetails();
	public void balance();
	public void deposit();
	public void withdrawl();
}
class ICICI implements bank
{
	static String Bankname="ICICI";
	int accountno;
	Scanner sc=new Scanner(System.in);
	String customername="melissa";
	int balance=50000;


	@Override
	public void showdetails() {
		System.out.println("Bank name="+Bankname);
		System.out.println("Customer name="+customername);
		System.out.println("Enter your account number");
		int acno=sc.nextInt();
		System.out.println("Balance="+balance);
		

	}

	@Override
	public void withdrawl() {
		System.out.println("Enter the amount");
		int amount=sc.nextInt();
		balance =balance-amount;
		
		
	}

	@Override
	public void deposit() {
		System.out.println("Enter the deposit amount");
		int dep=sc.nextInt();
		balance=balance+dep;
		
	}
	
	@Override
	public void balance() {
		System.out.println("Balance after withdrawl="+balance);

	}
		
	}
public class bankingapprblm
{
	public static void main(String[] Args)
	{
		ICICI i=new ICICI();
		i.showdetails();
		i.deposit();
		i.withdrawl();
		i.balance();
	}
}
	 

