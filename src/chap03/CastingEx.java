package chap03;

public class CastingEx {

	public static void main(String[] args) {
		
		// 자동형변환 예시를 해보자.
		int number = 10; // int 자료형
		long number2 = number; // 자동형변환 된다. int 가 long으로 자동형변환된다.
		float number3 = number2; // 자동형볂환 long이 float로 변환된다.
		// float number3 = number2; // F 붙이면 안된다. F는 상수에 붙는다. 변수값에 붙지 않는다.
		double number4 = number3; //자동형변환 float 가 double로 자동 변환된다.
		
		System.out.println(number);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);

	}

}
