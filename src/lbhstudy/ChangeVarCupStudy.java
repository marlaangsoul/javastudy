package lbhstudy;

public class ChangeVarCupStudy {

	public static void main(String[] args) {	
		/*
		컵 문제.
		조건이 아래와 같을 때, 두 컵의 결과 값을 교환하게 하여 나타내어라.
		단, 차감 없이 추가만해서 나타내어라.
		
		문제. 두컵의 데이터를 교환해라.
		결과 : (blue, red)
		
		
		String cupA = "red";
		String cupB = "blue";
		
		System.out.printf("(%s, %s)", cupA, cupB);
		*/
		
		String cupA = "red";
		String cupB = "blue";
		String temp = null; // << temp 값은 어떤 값이든 상관이 없다. 
		
		temp = cupA;
		cupA = cupB;
		cupB = temp;
				
		
		System.out.printf("(%s, %s)", cupA, cupB);
		
		
	}

}
