package controlstatements;

public class Switchcalprgm {
public static void main(String[] args)
{ 
	//calculator
	int a=20, b=10;
	int choice=3;
	switch(choice)
	{
	case 1: System.out.println("Result="+(a+b));
	break;
	case 2: System.out.println("Result="+(a-b));
	break;
	case 3: System.out.println("Result="+(a*b));
	break;
	case 4: System.out.println("Result="+(a/b));
	break;
	default:System.out.println("Invalid choice");
	}
}
}
