package controlstatements;

public class Nestedfor {
	public static void main(String[] args)
	{
		//to print pattern with 3 rows and 4 columns
		for(int i=1;i<=3;i++)//outer loop=row
		{
			for(int j=1;j<=4;j++)//inner loop=column
			{
				System.out.print("*");
				
			}
				System.out.println();//to print pattern in next line
		}
	}

}
