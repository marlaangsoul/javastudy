package chap03;
public class ChangeVar {

	public static void main(String[] args) {
		
		// 1. 변수를 선언함과 동시에 초기화 한다.
		String cupA = "red";
		String cupB = "blue";
		String cupT = ""; // 답

		cupT = cupA; // 답
		cupA = cupB; // 답
		cupB = cupT; // 답
		
		//위와 같은 해결 방법은 범용적인 프로그램이 될수있다.
		
		
		// 문제. 두컵의 데이터를 교환해라.
		
		System.out.printf("(%s, %s)", cupA, cupB);
		
		//결과 (blue, red)
		
		
		

	}

}