package oops;

public class UncheckedExceptiontypes {

	public static void main(String[] args) {
         
		try {
		int a=20, b=0;
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Arithematic exception");

		}
		try {
		int a[]=new int[2];
		a[0]=15;
		a[1]=10;
		System.out.println(a[2]);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());			
			System.out.println("Arrayindexoutofboundexception");

		
		}
		try {
		String s=null;
		System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Null point exception");


		}
	}

}
