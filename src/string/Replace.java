package string;
import java.util.Scanner;
public class Replace {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a word");
		String s1 = s.nextLine();
		String s2=s1.replace('r','t');
        System.out.println(s2);

	}

}
