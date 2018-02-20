package Bufferedclass;

public class employeedemo {
	int id;
	String name;

	public static void main(String[] args) {
		System.out.println("enter the details of first employee");
		employeedemo s=new employeedemo();
		s.id=101;
		s.name="rohan";
		System.out.println("id is="+s.id);
		System.out.println("name is="+s.name);
		
		System.out.println("enter the details of second employee");
		employeedemo s1=new employeedemo();
		s1.id=102;
		s1.name="shubham";
		System.out.println("id is="+s1.id);
		System.out.println("name is="+s1.name);
		

	}

}
