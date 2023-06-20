package oops;

class Emp
{
	private String empname;
	private String empdesignation;
	//right click>>source>>generate getter and setter
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesignation() {
		return empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
	
	
}







public class Encapsulation {

	public static void main(String[] args) {
		Emp ob=new Emp();
		ob.setEmpname("Raghav");
		ob.setEmpdesignation("tester");
		System.out.println(ob.getEmpname());
		System.out.println(ob.getEmpdesignation());

		

	}

}
