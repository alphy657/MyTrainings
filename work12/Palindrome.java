package work12;

public class Palindrome 
{
	public void pal(String s)
	{
		int i=0;
		int j=s.length()-1;
		int k=1;
		String s1=s.toLowerCase();
		while(i<j)
		{
			if(s1.charAt(i)!=s1.charAt(j))
				k=0;
				i++;
				j--;
		}
		if(k==1)
			System.out.println(s+ " = Palindrome");
		else
			System.out.println(s+ " = Not Palindrome");
	}

	public static void main(String args[])
	{
		Palindrome ob=new Palindrome();
		ob.pal("java");
		ob.pal("Malayalam");
		
	}
}
