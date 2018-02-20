package inheritance;

public class Practice1 {

	public static void main(String[] args) {
		H h1=new H();
		h1.sum(23, 10);
		//h1.show();
		h1.display();
		

	}

}
 class G
{
   int i,j;
	G(int a, int b)
	{
		i=a;
		j=b;
		System.out.println("parent class");
	}
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
}
 class H extends G
 {
	 H()
	 {
	 super(10,52);
	 System.out.println("child class");
 }
 void display()
 {
	 super.sum(20,4 );
	 System.out.println(i);
	 System.out.println(j);
 }
 
	 void sum(int a, int b)
	 {
		 System.out.println(i+j);
	 }
 
 {
	 
 }
 }
