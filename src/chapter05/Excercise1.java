package chapter05;

public class Excercise1 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0; i<=100; i++) {
			if(i % 5 ==0) {
				sum += i;
			}
		}
		System.out.println("1~ 100까지 5의 배수 합은 : " + sum);
		
	}

}
