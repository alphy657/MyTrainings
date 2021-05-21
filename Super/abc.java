package Super;

public class abc {
	protected int a =10;
	protected int b =30;
	int c;
public void print()
{
	System.out.println("parent class constructor");
}
public abc (int a, int b)
	{
		c=a+b;
		System.out.println(c);	
	}
public abc()
{
	System.out.println("default constructor of abc");	
}
}