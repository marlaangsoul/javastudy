package chapter04;

public class OpEx4 {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a != b);
		
		boolean c = a==b;
		System.out.println("c = " +c);
		boolean d = c == false;
		System.out.println("d = "+d);
		
		String myName = "bar";
		String yourName = "bar";
		System.out.println(myName == yourName);
		
		
		
		
	}

}
