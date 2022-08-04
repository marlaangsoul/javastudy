package chapter04;

public class OpEx2 {

	public static void main(String[] args) {

		int a = 10;
		int b = 4;
		int r = a/b; //나눗셈은 정수로 줘야한다.
		//double d = a/(double)b;
		//double d = a/(double)b; 뒤에 보면, 하나에만 double로 넣어도 둘다 더블로 들어간다.
		//넣어라 아니면 전부 값이다.

		System.out.println("10/4 = " + a/b);
		System.out.println("10/4 = "+ (double)a/b);

		// 위의 값은 결과값을 실수로 연산되게 하는 방법이다.
		//데이터 형식은 정수이나, double 값으로 넣게 되면서 실수 값으로 변환한것이다.


		// 이번엔 캐릭터연산을 해보자.
		char c1 = 'a';
		char c2 = 'b';
		int c3 = c1 +c2;// 자동형변환이 되었다.
		int c4 = (int)c1 + (int)c2; // 강제형변환 시켰다.


		System.out.println("");
		System.out.println("c3 = " +c3);
		System.out.println("c4 = " +c4);
		System.out.println(r);


		// 자동으로 형변환을 시켜주는데 강제형변환을 알아야 하는이유는, 위의 예제에서 값자기 c1을 뽑아야하는 상황이 생길때 사용한다. 
		
		





	}

}
