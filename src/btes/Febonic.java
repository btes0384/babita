package btes;

public class Febonic {

	public static void main(String[] args)
	{
		int n,a=0,b=1,i;
		{
	System.out.print(+a+" "+b);
	}
		
	for(i=1;i<=10;i++)
	{
		n=a+b;
	System.out.print(" "+n);
      a=b;
      b=n;
	}
	}
	

}
