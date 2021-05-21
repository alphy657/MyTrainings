package Super;

public class Divisible extends add {
	public void div()
	{
	int n= super.add(20,60);
	if(n%10==0)
		System.out.println("number divisible by 10");
	else
		System.out.println("not divisible by 10");
}
	public static void main(String args[])
	 {
	   Divisible ob= new Divisible();
	   ob.div();
	}
	}