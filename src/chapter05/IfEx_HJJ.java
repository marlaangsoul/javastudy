package chapter05;

public class IfEx_HJJ {

	public static void main(String[] args) {
		
//		int score = 4;
//		System.out.println("홀수 인가요? 짝수 인가요?");
//		if ( score = score % 2) {
//			System.out.println("홀수입니다.");
//		} else {
//			System.out.println("짝수입니다.");
//		}
//		System.out.println("종료");
//		
//		ㄴ 위에는 내가 하던것.
		
		int score = 51;
		int i = score % 2;
		boolean b = i == 0;
		if(b) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		System.out.println("끝");
		
		
		
		
		

	}

}
