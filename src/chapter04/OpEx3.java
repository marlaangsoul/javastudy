package chapter04;

public class OpEx3 {

	public static void main(String[] args) {
		
		int a = 10;
		int b;
		a = a +1;
		a += 1;
		++a; // 전위 연산 이고 a값에 1을 더한다.
		a--; // 후위 연산이고 a 값에서 1을 뺸다.
		
		System.out.println(a);
		System.out.println("");
		
		//전위, 후위 연산 차이.
		
		a = 10;
		b= a++;
		System.out.printf("(a,b) = (%s,%s)", a,b);
		System.out.println();
		b = ++a;
		System.out.printf("(a,b) = (%s,%s)", a,b);
		
		

	}

}
