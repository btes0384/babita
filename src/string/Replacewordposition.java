package string;

public class Replacewordposition {

	public static void main(String[] args) 
	{
		String s = "chandigarh is a beautiful city";
		String revstring="";
		String s3[]=s.split(" ");
		for(int i=0;i<s3.length;i++)
		{
			String s2=s3[i];
			String revword="";
			for(int j=s2.length()-1;j>=0;j--)
			{
				revword = revword+s2.charAt(j);
		}
		
			revstring=revstring+revword+" ";
	}
		System.out.println(revstring);
		
		}
	}

	


