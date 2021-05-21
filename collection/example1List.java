package collection;

import java.util.ArrayList;
import java.util.List;

public class example1List {
	
	public static void main(String args[])  
	{
	List<Integer>a1=new ArrayList<Integer>();
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
	List<Integer>a2=new ArrayList<Integer>();
	a2.addAll(a1);
	for(Integer i:a2)
	{
		System.out.println("Values added  "+i);
	}
	}

}
