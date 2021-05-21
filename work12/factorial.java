package work12;

public class factorial
{
 public int fact(int n)
 {
	 int a=1;
	 for(int i=1;i<=n;i++)
		 a=a*i;
	 return a;
 }
 public void print()
 {
	 int f=this.fact(5) ;
	System.out.println("Factorial = " +f);
 }
 public static void main(String args[])
 {
   factorial ob= new factorial();
   ob.print();
}
}

