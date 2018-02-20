package string;

public class Multispaces {

	public static void main(String[] args) 
	{
		String s ="i   am    babita";
        s =s.replaceAll("( )+"," ");
        System.out.println(s);
        
	}

}
