package methods;

class member
{
	String name;
	int age;
	String phonenumber;
	String address;
	int salary;
	public void printdetails()
	
	{
		System.out.println("name"+name);

		System.out.println("Age"+age);
		System.out.println("Phonenumber"+phonenumber);
		System.out.println("address"+address);
		System.out.println("salary"+salary);

		
	}
}
  class employee extends member
  {
   String specialization;
  }
  class manager  extends member
   {
	String department;
   }



public class Inheritanceprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	employee emp1=new employee();
	emp1.name="Arun";
	emp1.age=24;
	emp1.phonenumber="9400882234";
	emp1.address="bangalore";
	emp1.salary=30000;
	System.out.println(emp1.specialization="tester");
	emp1.printdetails();
    manager m= new manager();

	System.out.println(m.department="Scrum");


 
	}
	
		
	
	

	
	

	}


