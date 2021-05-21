package work12;

import java.util.Scanner;

public class Marks {
 static int Total;
 static float s;
 
 public Marks(String a)
 {
	 Scanner in=new Scanner(System.in);
	System.out.println("marks of  "+a+" in physics");
	 int ph=in.nextInt();
	 System.out.println("marks of "+a+" in chemistry");
	 int ch=in.nextInt();
	 System.out.println("marks of "+a+" in maths");
	 int ma=in.nextInt();
	 Total=ph+ch+ma;
	 System.out.println("Total marks of "+a+"=" +Total);
	 s=(Total*100)/3;
 }
 public static void main(String args[])
 {
	 Marks ob=new Marks("Tom");
	 ob.grade("Tom",s);
	 System.out.println();
	 Marks ob1=new Marks("Jerry");
	 ob.grade("Jerry",s);	 
 }
 
 public static void grade(String n, float s)
 {
	 if(s<40)
		 System.out.println("Grade of "+n+" is F");
	 
	 	else if(s<=60 && s>=40)
		 System.out.println("Grade of "+n+" is E");
	 
	 	else if(s<=70 && s>=61)
		 System.out.println("Grade of "+n+" is C");
	 
	 	else if(s<=80 && s>=71)
		 System.out.println("Grade of "+n+" is B");
	 
	 else
	 	 System.out.println("Grade of "+n+" is A");
	 	 
 }
}
