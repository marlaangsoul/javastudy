package chapter06;

public class ArrEx8 {

	public static void main(String[] args) {

		// 배열을 이용하여 1 ~ 100까지 입력 후 출력하시오.

		int[] num = new int[100];

		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
			System.out.println(num[i]);
		}
		// 배열을 이용하여 1~  100까지의 합을 출력하시오.
		System.out.println("=======================================");
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
			sum = sum + num[i];
		}
		System.out.println(sum);

		//배열을 이용하여 1~ 짝의 합을 구하시오.

	}




}
