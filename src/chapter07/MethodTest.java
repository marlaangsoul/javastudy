package chapter07;

public class MethodTest {

	public static void main(String[] args) {
		char c = intToChar(65);
		//위의 c와 아래의 c는 지역 변수이기 때문에 다르다.
		// ㄴ 메서드 사용법
		System.out.println(c);
		
	}

	public static char intToChar(int a){
		char c = ' ';
		c = (char)a;

		return c;
		// ㄴ 메서드 만드는 법.
	}

	
	}




