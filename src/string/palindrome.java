package string;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args)
	{
		String str , rev ="";
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		str =s.nextLine();
		int length = str.length();
		for(int i=length-1;i>=0;i--)
			rev =rev+str.charAt(i);
		if(str.equals(rev))
			System.out.println(str+ " is palindrome");
		else
			System.out.println(str+ " is not palindrome");
		
	

	}

}
