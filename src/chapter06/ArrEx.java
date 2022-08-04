package chapter06;

import java.util.Arrays;

public class ArrEx {

	public static void main(String[] args) {
		
//		int[] arrInt;
//		int arrInt2[];
//		
//		double[] arrDouble;
//		String[] arrString;
		//주로 변수타입에 [대괄호를 쓴다.]
		
//		int a0 = 1;
//		int a1 = 2;
//		int a2 = 3;
//		int a3 = 4;
//		int a4 = 5;
		//이걸 1000개까지 만들때..
		//반복문으로 만들면 변수는 만들수 있으나, 값을 담을수가 없네???
		//그때 쓰는게 배열로 값까지 담는 것.
		//1. 같은 타입
		//2. 타입[] 배열명;
		//3. iIndex > 자료형 int
		//4. 반복문 사용하기.
//		int[] a ; // <<< 변수를 선언만 한것. 
		int[] a = new int[5];// << 이게 변수 선언하고 초기화 할때 방까지 만든것. 
//		System.out.println(Arrays.toString(a)); //이거 찍어보면, 방을 0으로 만드는 초기 값을 알수 있다.
//		a[0]=1; // <<< 여기까지 할때 오류가 나는 이유는?? 배열을 만들때는 총 몇개를 만들지 알려줘야함.
//		a[1]=2;
//		a[2]=3;
//		a[3]=4;
//		a[4]=5;
//		// ㄴ 이게 위의 int a0 같이 만들것 과 같은 거다.
		
		for(int i = 0; i<5; i++) {
			a[i] = i+1;
			System.out.println(Arrays.toString(a));
		}
		
		//누적 sum
		int sum = 0;		
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
			sum = sum + a[i];
			
		}
		System.out.println(sum);


	}

}
