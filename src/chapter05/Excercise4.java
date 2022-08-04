package chapter05;

public class Excercise4 {
	public static void main(String[] args) {

		int jul = 0;
		int temp = 0;
		for(jul =1; jul<=5; jul++) {
			temp++;
			for(int i =1; i<=5; i++) {
				System.out.print("*");
				if(temp == jul) {
					System.out.println("");
				}
				}

		}
	}		
}
