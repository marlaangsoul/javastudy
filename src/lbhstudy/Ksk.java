package lbhstudy;

public class Ksk {

	public static void main(String[] args) {
		
		// 두 개의 주사위를 던졌습니다.
	      // 눈의 합이 6이 되는 모든 경우의 수를 출력하세요.
	      // 1+5, 2+4, 3+3, 4+2, 5+1
	      int sum = 0;
	      int i = 1;
	      int j = 1;
	      for(i = 1; i <=6; i++) {
	         i =+ 1;
	        for(j = 1; j <=6; j++) {
	           j =+ 1;
	         if(sum <=6)
	            break;
	            
	        }
	      }System.out.println(i + "+" + j);
		
		
	}

}