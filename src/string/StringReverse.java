package string;

public class StringReverse {

	public static void main(String[] args)
	{
		String a="";
		String s="waheguru";
		for(int i=0;i<s.length();i++)
		System.out.println(s);
		String b=new String("satnam");
		for(int i=b.length()-1;i>=0;i--)
		{
			a=a+b.charAt(i);
		}
		System.out.println(a);
		
			
	

	}

}
