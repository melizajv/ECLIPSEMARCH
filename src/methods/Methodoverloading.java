package methods;
//polymorphism--methodoverloading
public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Methodoverloading ob= new Methodoverloading();
   ob.add();
   ob.add(20,30);
   ob.add(20,30.5);
   ob.add(30.5,20);
	}
 public void add()
 {
	 int a=30,b=40,c;
	 c=a+b;
	 System.out.println(c);
 }
 
 public void add(int a, int b)//changing arguments
 {
	 int c=a+b;
	 System.out.println(c);

 }
 public void add(int a, double b)//changing datatype
 {
	 double c=a+b;
	 System.out.println(c);

 }
 public void add(double a, int b)//changing order
 {
	 double c=a+b;
	 System.out.println(c);

 }
}
