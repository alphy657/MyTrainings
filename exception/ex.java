package exception;

public class ex{
	public void hello() {
		try
		{
			int a=50/0;
			System.out.println(a); 
			System.out.println("try access");
		}
		catch(ArithmeticException e)
		//catch(Exception e)
		{
			
			System.out.println(e);
			e.printStackTrace();
		}}
public static void main(String args[])
{
	ex ob=new ex();
	ob.hello();
	System.out.println("ex");
}
}
