package methods;
//single dimensional
class Animal
{
	public void Animalfood()
	{
		System.out.println("Animalfood");
	}
}
class Dogs extends Animal
{
	public void Breed()
	{ 
		System.out.println("Beagle");
	}
}
//multidimensional
class Babydog extends Dog
{
	public void Size()
	{
		System.out.println("Size");
	}
}
public class SingleandmultidimensionalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Dogs ob= new Dogs();
    ob.Animalfood();
    ob.Breed();
    Babydog baby= new Babydog();
    baby.Animalfood();
    baby.Breed();
    baby.Size();
    
	}

}
