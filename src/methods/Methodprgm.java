package methods;

public class Methodprgm {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Methodprgm ob=new Methodprgm();
    ob.add();
    int subt=ob.sub();
    System.out.println("Substraction="+subt);
    int mult=ob.mul(20, 30);
    System.out.println("Multiplication="+mult);

    ob.div(5,5);

	}
	//1.method w/o return type & w/o parameters
    public void add()
    {
    int a=30,b=50;
    int c=a+b;
    System.out.println(c);
}
    //2.method with return type & w/o parameters
    public int sub()
    { 
    	int a =40,b=5;
    	int c= a-b;
    	return c;

    }
    //3.method with return type and with parameters
    public int mul(int a, int b)
    {
    	int c= a*b;
    	return c;
    	
    }
    //4.method w/o return type and with parameters
    public void  div(int a, int b)
    {
    	int c=a/b;
    	System.out.println(c);
    	
    
    	
    }

}

