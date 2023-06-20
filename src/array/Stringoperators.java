package array;

public class Stringoperators {

	public static void main(String[] args) {
	
	//1.Concatenation
		String s="hello";
		String s1="world";
		String s2="How are you";
		System.out.println(s.concat(s1));//helloworld
		System.out.println(1+2+s+4+5);//3hello45
		
	//2.Equals
		System.out.println(s.equals(s1));//false
		System.out.println(s.equalsIgnoreCase(s1));//if s1=Hello,o/p=true
		
	//3.contains
		System.out.println(s2.contains("how"));//true
		
	//4.touppercase 7 tolowercase
		System.out.println(s.toUpperCase());//HELLO
		System.out.println(s1.toLowerCase());
	
	//5.trim()- spaces from begining and end will be removed
		System.out.println(s.trim());//spaces will be removed
		
	//6.length()x
		System.out.println(s.length());//5

	//7.startswith
		System.out.println(s2.startsWith("How"));//true,if"how" is given -o/p=false
		
	//8.endswith
		System.out.println(s2.endsWith("you"));//true
		
	//9.Substring
		System.out.println(s.substring(1,5));//ello
		
	//10.charAt()
		System.out.println(s.charAt(4));//o
		
	//split()
		String[] sr=s2.split(" ");
		for(String v:sr)
		{
			System.out.println(v);//how
			                      //are
			                      //you
		}   
	}

}
