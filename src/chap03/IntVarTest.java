package chap03;

public class IntVarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//아래는 변수를 선언하는 것이다.
		int i0;
		long l0;
		// 아래는 변수를 초기화한것이다.
		// 초기화란? 
		i0 = 0;
		l0 = 0L; // long형 일때는 L을 붙여야 하고, 이때는 소문자 l도 가능하다. 즉 0l 가능.
		//long 데이터 타입을 설정할때는 L이 붙어야 한다.
		// 변수 선언과 초기화
		int i1 = 1;
		long l1 = 1L; // 1l 소문자 가능
		
		// 출력 : 이때 주의 할 점은, 변수명과 문자열은 다른다는 것이다.
		
		System.out.println("i0");
		System.out.println("l0");
		System.out.println("i1");
		System.out.println("l1");
		//ㄴ 위에 애들은 그냥 문자를 출력한것.
		
		System.out.println(i0);
		System.out.println(l0);
		System.out.println(i1);
		System.out.println(l1);
		//ㄴ 위에 애들은 변수를 출력한것.

		
	}

}
