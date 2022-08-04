package lbhstudy;

public class Stringbar_equals {

	public static void main(String[] args) {
		
		String myName = "bar";
		String yourName = "bar";
		System.out.println(myName == yourName);
		// == 비교 연산자.
		System.out.println(myName.equals(yourName));
		// 원래는 객체형인 String은 아래와 같이 equals를 써서 값을 비교 해야하나,
		// 편의 성을 위해서 위와 같은 코딩도 가능해 졌다.
		
		System.out.println("=============================");
		myName = new String("foo");
		yourName = new String("foo");
		System.out.println(myName == yourName); // 왜 false일까?
		//왜냐하면 생성자로 new 생성자로 생성시 위의 비교는 '값'이 아닌 "주소"를 비교한 것이기 때문이다.
		//값을 비교하고자 하면 아래와 같이 해보자.
		System.out.println(myName.equals(yourName));
		//이러면 값을 비교하기 때문에 true가 나온다.
		
		

	}

}
