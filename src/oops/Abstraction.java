package oops;

abstract class Car
{
	abstract public void speedlimit();
	public void  carengine()
	{
		System.out.println("car engine");
	}
}
class Maruti extends Car
{

	@Override
	public void speedlimit() {
		System.out.println("Maruti speed limit");
		
	}
	
class BMW extends Car
{

	@Override
	public void speedlimit() {
	System.out.println("Maruti speed limit");

	}
}

public class Abstraction {

	public static void main(String[] args) {
   Maruti m =new Maruti();
   m.speedlimit();
   m.carengine();
	}

}
}
