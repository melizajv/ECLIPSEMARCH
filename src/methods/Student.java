package methods;

public class Student {
	//parameterized constructor
	int studentid;
    String studentname;
    String college="cea";
    public Student(int studentid, String studentname)//constructor name= class name
    {
    	this.studentid=studentid; //this.-- to point the instance variable 
    	this.studentname=studentname;
    	
    }
    public void display()//-- to display the values
    
    {
    	System.out.println("Studentid="+studentid);
    	System.out.println("Studentname ="+studentname);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(101,"melissa");
		s.display();
	}

}
