package methods;

public class Shapesareaprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapesareaprgm ob=new Shapesareaprgm();
	    ob.triangle();
	    int arrec=ob.rectangle();
	    System.out.println("Area of rectangle="+arrec);
	    double arcir=ob.circle(5);
	    System.out.println("Area of circle="+arcir);

	    ob.square(6);
	}
	 public void triangle()
	    {
	    int b=10,h=3;
	    double c=0.5*10*3;
	    System.out.println("Area of triangle ="+c);
}
	 public int rectangle()
	 {
		 int l=20,b=30;
		 int c=l*b;
		 return c;
	 }
	public double circle(int r)
	{
		double  c= 3.14*r*r;
		return c;
	}
	public  void square(int a)
	{
		int c=a*a;
		System.out.println("Area of square="+c);
		
	}
	 }
