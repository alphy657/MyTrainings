package Methodoverriding;

public class Details {
 public String address()
 {
	 String c="Kottayam";
	 return(c);
 }
	public void print(String a, String ad)
	 {
		System.out.println("Student Name = " +a);
		System.out.println("Student Address = " +ad);
     }
	public static void main(String args[])
	 {
	   Details ob= new Details();
	   String c=ob.address();
	   Studentname ob1 =new Studentname();
	   String a=ob1.name();
	   ob.print(a,c);
	}
}


