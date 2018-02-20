package btes;

public class PrimeNo {

	public static void main(String[] args) 
	{
		boolean flag;
		int no;
		for( no=1;no<=100;no++)
		{
			flag=true;
			for(int i=2;i<no;i++ )
			{
				if(no%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println( no);
			}
		}
		
		

	}

}
