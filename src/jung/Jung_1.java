package jung;

public class Jung_1 {

	public static void main(String[] args) {

		System.out.println("1번. 헬로우 자바.");
		System.out.println("Hello world");
		System.out.println("");
		System.out.println("2번. println Text 뽑기");
		System.out.println("println은 텍스트 출력 후 자동 한줄 띄우기 해줌.");
		System.out.println("나의 이름은");
		System.out.println("zxx입니다.");
		System.out.println();//빈줄
		System.out.println("좋아하는 숫자는?");
		System.out.println("zxz입니다.");
		System.out.print("나의 이름은");
		System.out.print("임xx입니다.");
		System.out.print("");//print는 빈칸에서는 ""빈칸을 주어야 한다.
		System.out.print("좋아하는 숫자는");
		System.out.print("역시나 zxz입니다.");
		System.out.println(); //이거는 빈데이터라서 아무 효과가 없다. 
		System.out.println("");
		System.out.println("3번. printf 의 서식문자를 써보다." );
		System.out.println("윤동주");
		System.out.println("서시");
		System.out.println("죽는 날까지 하늘을 우러러");
		System.out.println("한 점 부끄럼이 없기를");
		System.out.println("잎새에 이는 바람에도");
		System.out.println("나는 괴로워했다.");
		System.out.println("별을 노래하는 마음으로");
		System.out.println("모든 죽어가는 것을 사랑해야지");
		System.out.println("그리고 나한테 주어진 길을");
		System.out.println("걸어가야겠다.");
		System.out.println("=====================");
		System.out.printf("%s \n", "윤동주"); //%s 는 스트링 문자열 출력.
		System.out.printf("%s \n","서시");
		System.out.printf("죽는 날까지 %s을 우러러 \n", "하늘");
		System.out.printf("%d 점 부끄럼이 없기를 \n", 1); // 10진수 정수형태의 출력.
		System.out.printf("%s에 이는 %s에도 \n", "잎새","바람");
		System.out.printf("%s는 괴로워했다. \n","나");
		System.out.printf("%s을 %s하는 %s으로 \n", "별", "노래", "마을");
		System.out.printf("%s 죽어가는 것을 %s 해야지 \n", "모든", "사랑");
		System.out.printf("그리고 %s한테 주어진 %s을 \n", "나", "길");
		System.out.printf("걸어가야겠다. \n");
		System.out.println("");
		System.out.println("4번.연산자에서 정수형을 공부해보자.");
		System.out.println("아래 보는 것처럼 보이는 것과 변수명과 문자를 출력하는 것은 다르다.");
		//변수 선언
		int i0;
		long l0;
		//변수 초기화
		i0 = 0;
		l0 = 0L; // 0l 소문자 가능
		//변수 선언과 초기화
		int i1 = 1;
		long l1= 1L; // 1l 소문자 가능.
		//출력 : 주의 => 변수명과 문자열은 다름
		System.out.println("i0");
		System.out.println("l0");
		System.out.println("i1");
		System.out.println("l1");
		System.out.println("===");
		System.out.println(i0);
		System.out.println(l0);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println("");
		System.out.println("5번. 변수중 실수형을 배우자.");
		double d0;
		float f0;
		d0 = 3.14;
		f0 = 3.14F;
		double d1 = 3.14;
		float f1 = 3.14F; //f는 소문자 가능
		System.out.println(d0);
		System.out.println(f0);
		System.out.println(d1);
		System.out.println(f1);
		System.out.println();
		System.out.println("5.번 논리형 변수를 사용해 보자. //여기서 부터는 변수 선언과 초기화를 함께 한다.");
		//변수 선언과 초기화
		boolean t0 = true;
		boolean F0 = false;
		boolean t1 = true;
		boolean F1 = false;
		System.out.println(t0);
		System.out.println(F0);
		System.out.println(t1);
		System.out.println(F1);
		System.out.println("");
		System.out.println("6번. 문자형을 해보자.");
		System.out.println("한개 문자 저장. 여러개의 문자(문자열)은 String 객체 사용.");
		char c0 = 'a'; // 캐릭터는 문자열 1개 이기 때문에 '' 작은 따움표를 써준다.
		char c1 = 'b'; 
		System.out.println(c0);
		System.out.println(c1);
		char c2 = 65;
		System.out.println(c2);
		System.out.println("");
		System.out.println("7번. 참조형변수를 사용해보자.");
		System.out.println("객체 타입으로 참조 주소를 저장한다.");
		System.out.println("기xx 변수이외에는 모두 참조 변수 이며, String 클래스 : 문자열을 저장하는 객체 타입이다.");
		String name2 = "ㅋㅌㅋㅌ";
		String name3 = null;
		String name4 = "";
		System.out.println("name2="+name2);
		System.out.println("name3="+name3);
		System.out.println("name4="+name4);
		System.out.println("");
		System.out.println("8번. 상수와 리터럴에 대해 알아보자.");
		System.out.println("상수는 변수에 데이터를 할당 후 변경할수 없는 데이터를 말한다.");
		System.out.println("리터럴은 소스에 직접 입력된 데이터를 말한다.");
		final double PI = 3.14;
		System.out.println("final double PI = 3.14로");
		System.out.println("final을 변수 앞에 붙이면 상수가 된다.");
		//PI = 3.1459;
		System.out.println(PI);
		System.out.println("");
		System.out.println("8번.변수의 범위");
		System.out.println("자바에서 지역 변수는 {괄호}안에서만 적용 된다. 아래는 예시만 작성");
		System.out.println("package chapter03;\r\n"
				+ "\r\n"
				+ "public class ScopeEx { // 1. 클래스 블럭\r\n"
				+ "\r\n"
				+ "    int no; // 1. 클래스 블럭 내에서 사용 가능한 변수\r\n"
				+ "\r\n"
				+ "    public static void main(String[] args) { // 2. main 메서드 블럭\r\n"
				+ "\r\n"
				+ "        String name; // 2. main 메서드 블럭 내에서 사용 가능한 변수\r\n"
				+ "\r\n"
				+ "        if (true) {\r\n"
				+ "            // 메서드 블럭 안에서 선언한 변수 사용 가능\r\n"
				+ "            name = \"홍길동\";\r\n"
				+ "\r\n"
				+ "            // if문 블럭안에서 변수 선언\r\n"
				+ "            String email = \"hong@test.com\";\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        // if문 블럭 밖에서 email 변수를 사용하면 에러 발생 \r\n"
				+ "        //email = \"hong@test.com\";\r\n"
				+ "    }\r\n"
				+ "}\r\n"
				+ "");
		System.out.println("");
		System.out.println("9번. 두 변수의 값 교환하기");
		System.out.println("참고로 문자 변수는 String을 쓴다.맨 앞에는 대문자를 써서 String으로 써야하니 꼭 기억하자.");
		System.out.println("String cupA = \"blue\";\r\n"
				+ "String cupB = \"red\";\n"
				+ "System.out.println(cupA,cupB)\n"
				+ "결과물은 \"(red, blue)\"로 나오게 해라.");
		String cupA = "blue"; //변수명에 띄어쓰기 하면 안된다. ex) String cup A = 안됨.
		String cupB = "red";
		String cupT = null;
		
		cupT = cupA;
		cupA = cupB;
		cupB = cupT;
		
		System.out.printf("문제 풀이 완료 : (%s , %s)", cupA,cupB);//string 변수는 다시 출력할때, printf를 써야한다.
		System.out.println("\n");
		System.out.println("10번. 자동(묵시적)형변환을 확인해 보자.");
		System.out.println("큰 크기 자료형에 작은 크기 자료형을 할당할 경우 자동으로 형변환이 된다.");
		int number = 10;
		long number2 = number; //자동으로 int에서 long으로 형변환이 된다.
		float number3 = number2; //자동으로 long에서 float으로 형변환이 된다.
		double number4 = number3; //자동으로 float에서 double으로 형변환이 된다.
		System.out.println(number);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println("\n11번. 강제로 형변환을 해보자.");
		System.out.println("작은 크기의 자료형에 큰크기 자료형을 할당하는 경우.");
		double pi = 3.14;
		int pi2 = (int)pi;
		System.out.println(pi2);
		System.out.println("ㄴ 보이는 바와 같이 위의 출력에서는 값의 손실이 발생했다.\n");
		System.out.println("12번. 문자열을 정수로 변환해 보자.");
		String s1 = "1";
		String s2 = "2";
		int I1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		int add = I1 + i2;
		System.out.println(add);
		System.out.println("13번. 연산자를 보자. 대입(할당)을 해보자.");
		System.out.println("먼저 아래와 같이 에러가 나는 경우를 보자.");
		System.out.println("\r\n"
				+ "        int a = 10;\r\n"
				+ "        10 = a;     // 에러 1\r\n"
				+ "        a + 1 = 10; // 에러 2\r\n"
				+ "        10 = 1;     // 에러 3\r\n"
				+ "        a = a + 10; // 정상\r\n"
				+ "        ");
		int N1 = 10;
		System.out.println("N1 = 10 >"+N1);
		int N2 = N1; 
		System.out.printf("(N1,N2) > (%s,%s)", N1,N2);
		System.out.println("\n14번.산술 연산자를 해보자.");
		int num1 = 10;
		num1 = num1 + 10;
		num1 = num1 - 10;
		num1 = num1 * 2;
		num1 = num1 / 2;
		num1 = num1 % 3;
		System.out.println(num1);
		System.out.println("이번엔 같은 산술 연산을 실수로 연산되게 해보자.");
		int a = 10;
		int b = 4;
		System.out.println(a/b);
		System.out.println((double)a/b);
		System.out.println("char 연산을 해보자.");
		char cc1 = 'a';
		char cc2 = 'b';
		int cc3 = cc1 + cc2;
		int cc4 = (int)cc1 + (int)cc2;
		System.out.println(cc3);
		System.out.println(cc4);
		System.out.println("문자열 덧셈을 해보자.");
		String ss1 = "Hello";
		String ss2 = "World!!";
		String ss3 = ss1 + " " + ss2;
		System.out.println(ss3);
		System.out.println("음수도 사용할수 있다.");
		int c = -a;
		System.out.println("c = " + c);
		
		
		
		
		
		
		
		
		
		
		



	}

}
