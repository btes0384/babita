package inheritance;

public class Inheritance3 {

	public static void main(String[] args)
	{
		Q b1 = new Q();
		b1.sum(10,34);
		b1.display();
       // b1.show();
	}

}
class P
{
	int x,y;
	P(int a,int b)
	{
		System.out.println("parent class");
		x=a;
		y=b;
	}
	void show()
	{
		System.out.println("good bye");
	}
	void sum(int a, int b)
	{
		System.out.println(a+b);
		
	}
}
class Q extends P
{
	Q()
	
	{
		super(10,20);
		System.out.println("child class");
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	void sum(int a, int b)
	{
		super.sum(a,b);
		System.out.println(a*b);
	}
}