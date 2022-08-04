package chapter04;

public class OpEx1 {

	public static void main(String[] args) {
		  /*
        int a = 10;
        10 = a;     // 에러 1
        a + 1 = 10; // 에러 2
        10 = 1;     // 에러 3
        a = a + 10; // 정상
        */
		
		/* 대입 할당 연산자.
		
		  int number1 = 10;
	        System.out.println("number1 = 10 -> "+number1); // 10출력


	        number1 = number1;
	        System.out.println("number1 = 10 -> "+number1); // 10출력

	        int number2 = number1;
	        System.out.printf("(number1, number2) -> (%s,%s)", number1, number2); // (10,10)출력

		*/
		
		int a1 = 10;
		System.out.println("a1 = 10 ->"+a1); //10출력.
		
		int a2 = a1;
		System.out.printf("(a1, a2) -> (%s,%s)", a1,a2); //(10,10)출력
		
		a1 = a1 + 10;
		a1 += 10; // 더하고 대입해라.
		System.out.println("a1 += 10-> " +a1);
		
		a1 = a1 - 10;
		a1 -= 10; // 빼고 대입해라.
		System.out.println("a1 -= 10-> " +a1);
		
		a1 = a1 *2;
		a1 *=2; // 곱하고 대입해라.
		System.out.println("a1 *= 2-> " +a1);
		
		a1 = a1 /2;
		a1 /=2; // 곱하고 대입해라.
		System.out.println("a1 /= 2-> " +a1);
		
		a1 = a1 %3;
		a1 %=3; // 곱하고 대입해라.
		System.out.println("a1 %= 3-> " +a1);
		
			
		
		
	}

}
