package inheritance;

public class Inheritance1 {

	public static void main(String[] args)
	{
		B b1 = new B();
		b1.show();
	}
}
		class A
		{
			int x;
			A()
			{
				System.out.println("in parent class constructor");
			x=100;	
			}
		}
		class B extends A
		{
			B()
			{
				super();
				System.out.println("in child class constructor");
			}
			void show()
			{
				System.out.println(x);
			}
			
		}
		

	


