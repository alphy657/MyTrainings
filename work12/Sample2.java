

package work12;

public class Sample2 {
	public static void main(String args[])
	{
	Sample2 ob=new Sample2();
	ob.print1();
	}
	public void print1()
	{
		this.print2();
		System.out.println("print  1");
	}
	public void print2()
	{
		this.print3();
		System.out.println("print  2");
	}
	public void print3()
	{
		
		System.out.println("print  3");
	}
}

