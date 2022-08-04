package chapter10;

public class RoundEx {

	public static void main(String[] args) {
		
		//원주율을 소수점 3자리로 반올림.
		System.out.println(Math.PI);
		double v1 = Math.PI * 1000;  
		double v2 = Math.round(v1);
		double v3 = v2 / 1000.0;
		System.out.println(v3);
		
		System.out.println(Math.round(Math.PI *1000)/1000.0);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		

	}

}
