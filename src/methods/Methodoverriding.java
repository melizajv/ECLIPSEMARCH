package methods;


class Car
{
	public void accelerator()
	{
		System.out.println("Accelerator");
	}
}
class KIA extends Car
{

	@Override
	public void accelerator() {
		// TODO Auto-generated method stub
		System.out.println("KIA aacelerator");
		super.accelerator();
	}
	
}
public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   KIA  ob= new KIA();
   ob.accelerator();
	}

}

