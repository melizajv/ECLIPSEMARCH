package pkg;

public class Operators {

	public static void main(String[] args) {
		
	//Arithematic operators
		int a=30, b=10;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));//quotient
		System.out.println("a%b="+(a%b));//reminder
		
	//Assignement operators
		int c=40,d=10;
		System.out.println("c+=d="+(c+=d));//c=c+d=40+10=50
		System.out.println("c-=d="+(c-=d));//c=c-d=50-10=40
		System.out.println("c*=d="+(c*=d));
		System.out.println("c/=d="+(c/=d));
		
	//Relational operators
		int e=50,g=30;
			System.out.println("e<g="+(e<g));
			System.out.println("e>g="+(e>g)); 
			System.out.println("e<=g="+(e<=g));
			System.out.println("e>=g="+(e>=g));
			System.out.println("e==g="+(e==g));
			System.out.println("e!=g="+(e!=g));
			
	//Logical operators
			
	//  A  B  A&&B  A||B  !A  !B
	//  0  0   0     0     1   1
    //  0  1   0     1     1   0
	//	1  0   0     1     0   1
	//  1  1   1     1     0   0
			
			String username="abc";
			String password="123";
			System.out.println(username =="abc" && password =="123");//true
			System.out.println(username =="abc" || password =="1234");//true
			System.out.println(!(username =="abc"));//false
			
	//Unary operator
	//++ - increment by 1
	//-- - decrement by 1
	//d++ - post increment
	//++d - pre increment
			
			int d1=2;
			System.out.println(d1++);//2
			System.out.println(d1);//3
			
	//Swapping of numbers with variable
			int a1=20, b1=30,c1;
			c1=a1;
			a1=b1;
			b1=c1;
			System.out.println("a1="+a1);
			System.out.println("b1="+b1);
	//swapping w/o variables
			int a2=40,b2=10;
			a2=a2+b2;//40+10=50
			b2=a2-b2;//50-10=40
			a2=a2-b2;//50-40=10
				System.out.println("value of a2="+a2);
				System.out.println("value of b2="+b2);
	


	}

}
