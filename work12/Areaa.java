package work12;

public class Areaa {
public static void main(String args[]) 
{
	Areaa.area(6);
	Areaa.area(24,6);
	Areaa.area(12,7,0.6);
}
public static void area(int s) 
{
	int a=s*s;
	System.out.println("Square area=" +a);
}
public static void area(int i, int j) 
{
	int a=i*j;
	System.out.println("Rectangle area=" +a);
}
public static void area(int k, int l, double m) 
{
	double a=(float)k*l*m;
	System.out.println("Triangle area=" +a);
}
}
