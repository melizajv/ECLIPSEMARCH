package controlstatements;

public class reverseofnos {
public static void main(String[] args)
{
	int m=3456,s=0,r;
	while(m>0)
	{
		r=m%10;
		s=s*10+r;
		m=m/10;
			
	}
	System.out.println(s);
}
}
