package chapter06;

import java.util.Arrays;

public class ArrayCopyTest {

	public static void main(String[] args) {
		
		//배열을 늘릴수 없기 때문에, 참조형변수를 사용해서 배열을 늘릴 것 처러 보이는 효과를 주는 것이다.
		int[] arr1 = {1,2,3,4,5};
		// 배열 늘리기 - 기존 값 복사
		int[] arr2 = new int[10];
		for(int i = 0;i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("arr2="+Arrays.toString(arr2));
		//배열 늘리기.System 클래스에 arraycopy() 메소드를 사용.
		int[] arr3 = new int[10];
		System.arraycopy(arr2, 0, arr3, 0, arr1.length);
		System.out.println("arr3="+Arrays.toString(arr3));
		
		
		//배열 늘리기 - Array 클래스 copy0f() 메소드 사용
		int[] arr4 = null;
		arr4 = Arrays.copyOf(arr1, arr1.length+5);
		System.out.println("arr4="+Arrays.toString(arr4));
		
		
		
		
		

	}

}
