package chapter06;

import java.util.Arrays;

public class ArrArgs {

	//배열을 입력 받아 그 배열의 요소들을 2배하는 메서드
	public static void arr2XRef(int[] arr) {// 배열을 두개 해주는 녹즙기
		for(int i=0; i<arr.length; i++) {
			arr[i]=arr[i]*2;	
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5}; // 저위에 int와 arr은 서로 다른 애들.
		arr2XRef(arr);
		for(i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[]));
		}
		
	}

}
