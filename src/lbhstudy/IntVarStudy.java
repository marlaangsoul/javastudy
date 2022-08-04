package lbhstudy;

public class IntVarStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 변수를 선언한다.
		// 2. 변수를 초기화 한다.
		// 3. 변수를 선언함과 동시에 초기화 한다.
		
		int i0;
		long l0;
		// 변수 초기화
		i0 = 0;
		l0 = 0L; // 0l 이런식으로 소문자가 가능하다.
		// 그리고 여기까지 쳤을때, 좌측에 노란색 불이 들어오는데
		// 그 이유는, 선언만 하고 사용하지 않았기 때문이다.
		
		int i1 = 1;
		long l1 = 1L;  // 쓰지를 않아서 컴파일이 되긴 하지만, 안내가 뜸.
		
		// 출력해보자
		System.out.println("i0");
		System.out.println("l0");
		System.out.println("i1");
		System.out.println("l1");
		System.out.println("");
		System.out.println(i0);
		System.out.println(l0);
		System.out.println(i1);
		System.out.println(l1);

	}

}
