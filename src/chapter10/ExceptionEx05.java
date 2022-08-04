package chapter10;

import java.util.ArrayList;

public class ExceptionEx05 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
//		int[] arr = new int[3];
		ArrayList list = new ArrayList()
				list = null ;
		
		try {
			System.out.println(3);			
//			System.out.println(0/0);
//			arr[3] =10;
			list.add("100");
			System.out.println(4);			
		} catch (ArithmeticException e) {
			System.out.println(5);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(6);
		} catch (NullPointerException e) {
			System.out.println(5);
		} catch (Exception e) {
			System.out.println(5);
		}	

		System.out.println(7);


	}

}
