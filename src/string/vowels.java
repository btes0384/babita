package string;

public class vowels {

	public static void main(String[] args)
	{
		int count=0;
		String s= "my name is babita sharma";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')


				
			{
				count++;
			}
		}
		System.out.println("vowles are"+""+count);
		
	

	}

	}

