package chap03;

public class StringEx {

	public static void main(String[] args) {
		//1. 변수를 선언해 보자.
		String name;
		//2. 변수를 초기화 해보자.
		name = ""; 
		//3. 변수를 선언함과 동시에 초기화 해보자.
		
		String name2 = "";
		String name3 = null; //주소가 아직 뭔지 몰라~ 라고 이야해 주는 것. 데이터 자체가 없다.
		String name4 = ""; //주소도 생성되고, 0이라는 문자열까지 데이터다.
		
		System.out.println("name="+name);
		System.out.println("name2="+name2.length()); // 길이를 보여준다.
		// .을 찍으면 뒤에 자식이 있다고 생각되어 진다.
		// 참조형 변수인 String은 .을 사용하여, 객체를 사용할수 있다.
		System.out.println("name3="+name3);
		System.out.println("name4="+name4);
		
		System.out.printf("name2=%s \n", name2);

		
	}

}
