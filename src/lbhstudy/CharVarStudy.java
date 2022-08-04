package lbhstudy;

public class CharVarStudy {

	public static void main(String[] args) {

		// 변수를 선언함과 동시에 초기화를 하자.
		
		char c0 = 'b'; //이때!! 키 포인트. char 는 문자 하나만 쓰기 떄문에 작은 따움표를 꼭 써야 한다.
		
		System.out.println(c0);
		
		char c2 = 65; // 이렇게 하면 아스키 코드 값의 65번째 문자가 보여진다.
		// 그래서 이것을 활용한다면...
		// 숫자를 1개씩 더 하면서, a~ z까지 입력하는 코드를 짤수 있다.
		
		System.out.println(c2);
		
		
	}

}
