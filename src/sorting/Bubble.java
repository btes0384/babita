package sorting;
import java.util.Scanner;
public class Bubble {

	public static void main(String[] args) 
	{
		int temp;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the values");
		int[] arr = new int[5];
		{
			for(int i=0;i<arr.length;i++)
			{
				arr[i]= s.nextInt();
			}
				for(int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr.length-1;j++)
					{
						if(arr[j]>arr[j+1])
						{
							temp=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=temp;
							
						}
					}
				}
			}
		
		{
			for(int i=0;i<arr.length;i++)
				System.out.println(arr[i]);
		}
	}
}
		

	


