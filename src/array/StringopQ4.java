package array;

public class StringopQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s3="Selenium web driver is used for web application testing";
		String s[]=s3.split(" ");
		for (String v:s)
		{
			if(v.contains("application"))
			{
				break;
			}
			else{
				System.out.println(v);

			}		}
		
		
	}

}
