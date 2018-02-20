package inheritance;

public class Inheritance2 {

	public static void main(String[] args)
	{
		B b1 = new B();
		b1.show();
	}
}
   class D
{
	int x;
	D (int a)
	{
	System.out.println("in parent class constructor");
	x=a;
	}
}
    class E extends D
{
	E()
	{
		super(100);
		System.out.println("in child class constructor");
	}
	void show()
	{
		System.out.println(x);
	


	}

}
