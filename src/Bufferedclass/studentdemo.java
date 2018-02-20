package Bufferedclass;

public class studentdemo 
{
	int rollno;
	String name;

	public static void main(String[] args) 
	{
		System.out.println("enter the details");
		studentdemo s=new studentdemo();
		s.rollno=1;
		s.name="babita";
		System.out.println("rollno is="+s.rollno);
		System.out.println("name is="+s.name);
		
		System.out.println("enter the details");
		studentdemo s1= new studentdemo();
		s1.rollno=2;
		s1.name="maninder";
		System.out.println("rollno is ="+s1.rollno);
		System.out.println("name is="+s1.name);
		
	
		

	}

}
