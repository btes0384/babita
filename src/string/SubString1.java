package string;
import java.util.Scanner;
public class SubString1 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter string");
		String s1 = s.nextLine();
		
		String s2 = s1.substring(1,4);
		System.out.println(s2);
		

	}

}
