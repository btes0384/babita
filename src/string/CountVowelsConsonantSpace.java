package string;

public class CountVowelsConsonantSpace
{



	public static void main(String[] args) 
	{
		int vowels=0,consonant=0,digit=0,space=0;
		String s="babita sharma 12";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vowels++;
			}
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				consonant++;
			}
			else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				digit++;
				
			}
			else if(s.charAt(i)==' ')
			{
				space++;
			}
		}
			System.out.println("vowels "+vowels);
			System.out.println("consonant"+consonant);
			System.out.println("digit"+digit);
			System.out.println("space"+space);
		
			

		}
			
	}

	
	
	
	
		
			
			

			
	

	

		
		

	

	

