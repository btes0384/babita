package string;

public class Demo1 {

	public static void main(String[] args)
	{
		String s="good";
		String s1 = new String("GOOD");
		if(s.equalsIgnoreCase(s1))
			System.out.println("same");
		else
			System.out.println("different");
		


	}

}
