package work12;

import java.util.Scanner;

public class system1
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in); 
		{
			System.out.println("Enter age");
			int age =s.nextInt();
			if(age>18)
			{
			     System.out.println("Eligible");
			}
			 else
			 {
				 System.out.println("not Eligible");	 	 
			 }
				
		}
	
	}
}


