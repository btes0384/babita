package string;

public class Anagram {

	public static void main(String[] args) 
	{
		String s = "silent";
		String s1 = "listen";
		
		boolean flag = true;
		
		for(int i=0;i<s.length();i++)
			
		{
			for(int j=0;j<s1.length();j++)
			{
				if(s.charAt(i)==s1.charAt(j))
					
				{
					flag= true;
					break;
					
				}
				else
				{
					flag=false;
				}
				
			}
		
			
		}
if(flag==true)
{
	System.out.println(true);
}
else
{
	System.out.println(false);
}
}
}
	


