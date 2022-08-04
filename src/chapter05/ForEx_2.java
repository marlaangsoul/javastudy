package chapter05;

public class ForEx_2 {

	public static void main(String[] args) {
		
//		int sum = 0;
//		for(int i=1; i<11 ; i++) {
//			sum = sum +i; // 누적의 개념. 임시로 담아 놓는 곳.
//			//누적의 개념은 정말 중요. 누적이 없이 하게 되면 어려워진다.
//			//System.out.printf("%s, %s \n", sum, i); 나오는지 체크
//			
//		}
//		System.out.println("sum="+sum);
//		
//		홀수만 찍어보기. 1 ~ 9까지.
		int sum = 0;
		for(int i=0;i<10;i++) {
			if(i%2 != 0)
			System.out.println(i);
		}

	}

}
