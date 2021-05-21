package work12;

public class Average {
	public static void main(String args[])
	{
		Average ob=new Average();
		ob.average1(3,4,7);
		ob.average1(5.7f,4.2f,6.1f);
	}
public static void average1(int a,int b,int c)
{
	int avg=(a+b+c)/3;
	System.out.println("average of integers  " +avg);
}
public static void average1(float d,float e,float f)
{
	float avg=(d+e+f)/3;
	System.out.println("average of floats  " +avg);
}
}

