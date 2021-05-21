package work12;

import java.util.Scanner;

public class Onseason extends Offseason {
	public void discount(float total)
	{
		float amount=(40*total)/100;
		System.out.println("Total amount after discount: "   +amount);
	}
	public void extension(float total)
	{
		super.discount(total);
	}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter season");
	String season=s.next();
	System.out.println("enter total amount");
	float total=s.nextFloat();
	Onseason ob=new Onseason();
	if(season.equalsIgnoreCase("Onseason"))
		ob.discount(total);
	else
			ob.extension(total);
}
	}