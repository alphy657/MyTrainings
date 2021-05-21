package work12;

public class Sample4 {
	String name;
	
		public static void main(String args[])
		{
		Sample4 ob=new Sample4("example");
		ob.display();
		}
		public Sample4(String name)
		{
			this.name=name;
			
		}
		public void display()
		{

		System.out.println(name);
		}

	}


