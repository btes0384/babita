package string;
import java.util.Scanner;
public class RemoveVowels {

	public static void main(String[] args)
	{
		String stradd,strrem;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any string");
		stradd = s.nextLine();
		System.out.println("remove all vowels");
		strrem = stradd.replaceAll("[aeiouAEIOU]"," ");
		System.out.println("all vowels are removed");
		System.out.println(strrem);

	}

}
