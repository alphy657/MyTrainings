package methodoverloading;

public class child extends parent
{
	public void get()
	{
		System.out.println("child");
	}
 public static void main (String args[])
 {
	 child ob=new child();
	 ob.get();
	 parent ob1=new parent();
	 ob1.get();
 }
}
