package collection;


import java.util.LinkedList;


public class example2linkedlist {
	public static void main(String args[])  
	{
	LinkedList<Integer>a1=new LinkedList<Integer>();
			a1.add(20);
			a1.add(30);
			a1.add(50);
			for(Integer i:a1)
			{
				System.out.println("Values added  "+i);
			}
	a1.remove(2);
	int  s=a1.size();
	System.out.println("size is "+s);
	System.out.println("Boolean returned  "+a1.add(60));
	System.out.println("add "+a1.size());
	System.out.println("Values removed is returned "+a1.remove(2));
	LinkedList<Integer>a2=new LinkedList<Integer>();
	a2.addAll(a1);
	for(Integer i:a2)
	{
		System.out.println("Values added  "+i);
	}
	}

}


