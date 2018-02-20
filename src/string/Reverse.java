package string;

public class Reverse {

	public static void main(String[] args) 
	{
		String s="i love india";
		String[]s1=s.split(" ");
		String rev=" ";
		
		for(int i=s1.length-1;i>=0;i--)
			rev +=(s1[i]+" ");
		System.out.println(rev);
		

	}

}
