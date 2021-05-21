package exception;

public class Finally {
	int a=50;
	static int b1=1;
	public void hello()
	{
		System.out.println(a);//50 gets printed
		int c=b1/0;
		//System.out.println(a);
		System.out.println(b1);
	}
//catch(ArithmeticException)
public static void main(String args[]) throws Throwable
{
	Finally ob=new Finally();
	try
	{
		ob.hello();
		ob.finalize();
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
	finally
	{
		System.out.println(b1);//mandatory execution within finally block prints the value of b1
		System.out.println("finally");
	}
	System.out.println("main");
}
}

