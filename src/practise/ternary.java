package practise;

public class ternary {

	public static void main(String[] args) {
		int a=2,b=4,c=5;
		String temp;
		temp =((a>b)&&(a>c)?"a is greater":(b>a)&&(b>c)?"b is greater":"c is greater");
		{
			System.out.println("value of="+temp);
		}
		

	}

}
