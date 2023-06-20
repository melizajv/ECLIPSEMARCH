package oops;


public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
   int s1=0;
   int s2=0;
   for(int i=1;i<=10;i++)
   {
	   if(i%2==0)
	   {
		   s1=s1+i;
		   
	   }	   
	   else
	   {
		   s2=s2+i;
	   }
   }
   System.out.println("Sum of even numbers="+s1);
   System.out.println("Sum of odd numbers="+s2);
   }
	}
	


