package work12;

public class Sample3 {
	public static void main(String args[])
	{
	Sample3 ob=new Sample3();
	}
	public Sample3()
	{
		this("Constructor with String arg");
		System.out.println("default ");
	}
	public Sample3(String n)
	{
		this(9);
		System.out.println(n);
	}
public Sample3(int a)
{

	System.out.println("Integer   " +a);
}

}


	
