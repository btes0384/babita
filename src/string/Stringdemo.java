package string;
import java.util.Scanner;
public class Stringdemo {

	public static void main(java.lang.String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the String");
		String s1 = s.nextLine().toUpperCase();
		System.out.println("enter the word to search");
		String s2 =s.nextLine().toUpperCase();
		if(s1.contains(s2))
		{
			System.out.println("true");
			
		}
		else
		{
			System.out.println("false");
		}
		
		
		
		
		
		
		
		

	}

}
