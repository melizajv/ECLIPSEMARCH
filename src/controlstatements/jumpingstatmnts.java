package controlstatements;

public class jumpingstatmnts {
public static void main(String[] args)
{
	for(int i=1;i<=10;i++)
	{
		if(i==5)
		{ 
			//break;// will print numbers till 4
			continue;//i=5, value will be skipped
		}
		System.out.println(i);
	}
}
}
