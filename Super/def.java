package Super;

public class def extends abc {
int c;
int a=3;
public def(int a, int b)
{
	super(a,b);
	c=a*b;
	System.out.println(c);
}
public def()
{
	super();
	System.out.println("default constructor def");
}
public void print1()
{
	super.print();
	System.out.println("print child class");
	System.out.println("print parent class variable "+super.a);
	System.out.println("print child class variable  "+a);
}
public static void main(String args[])
{
	
	def ob1=new def();
	def ob2=new def(10,30);
	ob1.print1();
}

}
