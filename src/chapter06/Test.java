package chapter06;

public class Test {

	public static void main(String[] args) {
		//main을 만드는 이유는 처음으로 실행시키기 위해서!! 이다.
		//static은 많은 애들을 사용할수 있다.		
		int x = fn(1,2);
		System.out.println(x);

	}
	public static int fn(int x, int y) {
		int sum = x + y;
		return sum;
				
	}

}


//함수란 하나의 특별한 목적의 작업을 수행하기 위해 독립적으로 
//설계된 코드의 집합으로 그 처리 로직을 재실행, 재사용 반복사용가능