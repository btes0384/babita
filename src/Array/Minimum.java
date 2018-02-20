package Array;
import java.util.Scanner;
public class Minimum {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
				System.out.println("enter the value");
		int[] arr = new int[6];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int min=arr[0];
		for(int i=1;i>arr.length;i++)
			min=arr[i];
		System.out.println("minimum no="+min);
		

	}

}
