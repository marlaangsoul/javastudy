package chapter04;

import java.util.Scanner;

public class OpEx4_1 {

	public static void main(String[] args) {
		
		//String 값을 비교해보자.
		//리터럴
		
		String myName = "bar";
		String yourName = "bar";
		System.out.println(myName == yourName);
		System.out.println(myName.equals(yourName));
		
		//생성자에 대해 해보자.
		myName = new String("foo");
		yourName = new String("foo");
		System.out.println(myName == yourName);
		System.out.println(myName.equals(yourName));
		System.out.println(myName.hashCode() + "/" + yourName.hashCode());
		
		//드디어 외부입력. Scanner
		System.out.println("name input >");
		Scanner scan = new Scanner(System.in);
		myName = scan.next();
		yourName = scan.next();
		System.out.println(myName == yourName);
		System.out.println(myName.equals(yourName));
		System.out.println(myName.hashCode() + "/"  + yourName.hashCode());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
