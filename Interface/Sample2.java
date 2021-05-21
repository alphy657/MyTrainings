package Interface;

public class Sample2 extends Sample1
{
	public void hey()
	{
		System.out.println("Abstract method hey of abstract class Sample1 invoked ");
	}
	public void hello()
	{
		System.out.println("Abstract method hello of interface Test1 invoked ");
	}
public static void main(String args[])
{
	Test1 ob= new Sample2();
	ob.hello();
	Sample1 ob1=new Sample2();
	ob1.hey();
	System.out.println("Abstract variable  of interface Test1 is" +ob.a );
	//a=89;
	}
}

