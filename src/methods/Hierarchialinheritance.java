package methods;


//hierarchial inheritance
class Animals
{
	public void Animaldetails() 
	{
		System.out.println("Animaldetails");
	}
}
class Dog extends Animals
{
	public void Dogdetails()
	{
		System.out.println("Dogdetails");
	}
}
class Tiger extends Animals
{
	public void Tigerdetails()
	{
		System.out.println("Tigerdetails");
	}
}

public class Hierarchialinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog ob = new Dog();
		ob.Animaldetails();
		ob.Dogdetails();
		
		Tiger t=new Tiger();
		t.Animaldetails();
		t.Tigerdetails();
	}

}
