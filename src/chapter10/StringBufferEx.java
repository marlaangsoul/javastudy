package chapter10;

public class StringBufferEx {

	public static void main(String[] args) {
//		System.out.println("문자열 연결전 sb1 = "+System.identityHashCode(sb1));
		StringBuffer sb1 = new StringBuffer("abcd");
		sb1.append("efgh");
//		System.out.println("문자열 연결후 sb1 = "+System.identityHashCode(sb1));
//		System.out.println(sb1);

		// StringBuffer 클래스 equals() 재정의 안되어 있음
//		System.out.println(sb1.toString().equals("abcdefgh"));
		System.out.println(sb1);

		long start = System.currentTimeMillis();

		String str = "";
		for (int i=0; i<100000; i++) {
			str += i;
		}

		// 끝
		long end = System.currentTimeMillis();
		System.out.println( "실행 시간 : " + ( end - start )/1000);




	}

}
