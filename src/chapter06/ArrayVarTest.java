package chapter06;

public class ArrayVarTest {

	public static void main(String[] args) {
//		//1번
//		int i1 = 1;
//		int i2 = i1;
//		//ㄴ 위에거는 된다.
//		//2번
//		String S1 = "aaa";
//		String s2 = s1;
//		
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = arr1;
//		// 당연히 위에 것도 된다.
//		//1번, 2번은 예시와 같은 것.
		
		int i1 = 1;
		int i2 = i1;
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = arr1;
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		
		//hash코드로 보면 확인핤 있는데 주소가 같다. = 값이 같다.
		
		arr1[0] =10;
		System.out.println(arr1[0]);
		System.out.println(arr1[0]);
		
		arr2[0] = 100;
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		

	}

}
