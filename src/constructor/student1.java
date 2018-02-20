package constructor;
import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.io.IOException;

 class student1 {
	static int idn=1;
	int id;
	String name;
	int marks;
	final static String course="java";
	
	InputStreamReader r= new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(r);
	
	student1() throws IOException
	{
	
		
		System.out.println("enter name");
		name=br.readLine();
		System.out.println("enter marks");
		marks=Integer.parseInt(br.readLine());
	id=idn;
	id=idn++;
	}
	
	
		student1 (int i,String n)
		{
			marks=i;
			name=n;
			
		}
		void display()
		{
			System.out.println("marks="+ marks);
			System.out.println("name="+ name);
			System.out.println("id="+id);
			
		}
		
		
		public static void main(String[] args) throws IOException
		{
		student1 s = new student1();
		student1 s1 = new student1();
		
		s.display();
		s1.display();

	}
		

}
