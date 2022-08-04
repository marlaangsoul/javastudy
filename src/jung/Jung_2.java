package jung;

import java.util.Scanner;

public class Jung_2 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.printf("%s은 %s를 사랑한다.", "임xxx","xxx경");
		System.out.println("나의 이름은 언제나 그렇듯 임xxx입니다.");
		System.out.println("지금은 자바를 공부하고 있죠.");
		System.out.println("정주행이라고 해서, 매일 자바 공부할때 했던 코딩을 처음부터 끝까지 1회 반복하는 겁니다.");
		System.out.println("오지게 반복하는 겁니다. 그럼 매일 300줄 이상의 코딩을 하게 되고,");
		System.out.println("주당 100줄씩 늘력갈 생각입니다. 그래서 하루 만줄 나오는 코딩을 할수 있게 해야겠어요.");
		System.out.print("이건 자동 한줄 띄우기가 안되는 코딩입니다.");
		System.out.print("하하하 그렇죠.");
		System.out.print("열공해서 넘어가야죠 하하하하");
		System.out.print("이정도면 충분하군요.");
		int bh = 1412;
		System.out.printf("코딩 사이에 %s를 이렇게 넣기 위해서는", "bh");
		System.out.println("이렇게 하면 된다.");
		System.out.printf("%s는 문자를 하고, %d는 10진수를 쓴다.", bh, 102920);
		System.out.println(bh);
		System.out.println("변수를 선언하고 초기화를 해보자.");
		int i0 = 0;
		long l0 = 3000000000L; // 변수 뒤에 L을 붙여야하는데 한번 보자.// 해보니 꼭 붙여야 한다. 
		int i1 = 1;
		long l1 = 1L;
		System.out.println(i0);
		System.out.println(l0);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println("이번엔 실수형을 해보자. ");
		double d0 = 3.14;
		float f0 = 3.14F;//역시 변수 뒤에 F를 안붙이면 안된다.
		double d1 = 3.14;
		float f1 = 3.14F;
		System.out.println(d0);
		System.out.println(f0);
		System.out.println(d1);
		System.out.println(f1);
		System.out.println("이번엔 논리형으로 해보자.");
		System.out.println("true, false는 나중에 중요하다.");
		boolean t0 = true;
		boolean F0 = false;
		boolean t1 = true;
		boolean F1 = false;
		System.out.println(t0);
		System.out.println(F0);
		System.out.println(t1);
		System.out.println(F1);
		char c0 = 'a';
		char c1 = 'b';
		System.out.println(c0);
		System.out.println(c1);
		char c2 = 50;
		System.out.println(c2);
		System.out.println("참조형을 해보자.");
		System.out.println("참조형도 중요하다.");
		System.out.println("나중에 많이 써먹기 때문.");
		String name = "임xx";
		String name2 = null;
		String name3 = "";
		String name4 = "";
		name = name2;  //name  = null
		name2 = name3; //name2 = ""
		name3 = name4; //name3 = ""
		name4 = name;  //name = null
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		//위에 것은 계획 대로 나옴.
		System.out.println("상수 만들기");
		int PI = 4124; //변수에 final 붙이면 상수가 되고, 해당 변수에 데이터 할당 시 변경할수 없는 데이터가 됨.
		PI = 2;
		System.out.println(PI);
		System.out.println("자동 형변환이 되는 것을 보자.");
		int num = 10;
		long num2 = num;
		float num3 = num2;
		double num4 = num3;
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println("강제형변환");
		double pi = 3.14;
		int pi2 = (int)pi;
		System.out.println(pi2);
		System.out.println("보이는 것처럼 pi2는 pi 변수를 int형으로 pi2 변수를만들었다.");
		String s1 = "1";
		String s2 = "2";
		int ii1 = Integer.parseInt(s1);
		int ii2 = Integer.parseInt(s2);
		int add = ii1 + ii2;
		System.out.println(add);
		int z = 20;
		z = z - 10;
		z = z * 2;
		z = z / 2;
		z = z % 3;
		System.out.println(z);
		int a = 10;
		int b= 4;
		System.out.println(a/b);
		char cc1 = 'a';
		char cc2 = 'b';
		int cc3 = cc1 + cc2;
		int cc4 = (int)cc1 + (int)cc2;
		System.out.println(cc3);
		System.out.println(cc4);
		String ss1 = "xxx";
		String ss2 = "xxx";
		String ss3 = ss1 + "은 사랑한다."	+ ss2;
		System.out.println(ss3);
		int cc = -a;
		System.out.println(cc);
		System.out.println("여기서 부터는 예습.");
		int aa = 10;
		aa++;
		//aa = aa+1;
		//aa += 1;
		//++aa; // 전위 연산
		//aa--; // 후위 연산
		System.out.print(aa);
		System.out.println("전위 후위 연산자를 한번 더 알아보자.");
		int m = 10, n = 5;
		int result;
		result = m++ + --n;
		System.out.printf("m = %d, n = %d, result = %d \n", m, n, result);
		// m = 11, 4, 14
		result = ++m - n--;
		System.out.printf("m = %d, n = %d, result = %d \n", m, n, result);
		System.out.println("비교 연산 먼저 해보자.");
		int o = 10;
		int p = 5;
		
		System.out.println(o > p);
		System.out.println("ㄴ 진실");
		System.out.println(o >= p);
		System.out.println("ㄴ 진실");
		System.out.println(o < p);
		System.out.println("ㄴ 거짓");
		System.out.println(o <= p);
		System.out.println("ㄴ 거짓");
		System.out.println(o == p);
		System.out.println("ㄴ 거짓");
		System.out.println(o != p );
		System.out.println("ㄴ 진실");
		
		boolean c = o == p;
		System.out.println("c = "+c);
		boolean d = c==false; // d 변수에 결과값 대입
		System.out.println("d = "+d);
		
		String myName = "bar";
		String yourName = "bar";
		System.out.println(myName == yourName);
		
		//String 값 비교.
		//리터럴
		String bH = "bar";
		String sK = "bar";
		System.out.println(bH == sK);
		System.out.println(bH.equals(sK));
		
		//생성자
		bH = new String("foo");
		sK = new String("foo");
		System.out.println(bH == sK);
		System.out.println(bH.equals(sK));
		System.out.println(bH.hashCode() + "/" + sK.hashCode());
		
		System.out.println("name input >");
		Scanner scan = new Scanner(System.in);//왜 에러니?
		bH = scan.next();
		sK = scan.next();
		System.out.println(bH == sK);
		System.out.println(bH.equals(sK));
		System.out.println(bH.hashCode() + "/" + sK.hashCode());
		
		
		
		
		
		
		

		
		
	}

}
