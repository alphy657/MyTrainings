package work12;

public class Addition {
	public static void main(String[] args) {
		Addition.add(4,5);
		Addition.add(4,0.3f);
	}
	
	public static void add(int a, int b)
	{
		int sum=a+b;
		System.out.println("sum=" +sum);
	}
	public static void add(int a, float b)
	{
		float sum=a+b;
		System.out.println("sum of int and float numbers=" +sum);
}
}

