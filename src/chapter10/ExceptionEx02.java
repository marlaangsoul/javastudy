package chapter10;

public class ExceptionEx02 {

	public static void main(String[] args) {
		int num = 100;
		int res = 0;
		
		for(int i = 0; i<1000000; i++) {
			
			try {
				res = num /(int)(Math.random()*10);
				System.out.println(res);
			} catch (Exception e) {
				System.out.println("예외처리");
			} 
			
		}
		
		
		
		

	}

}
