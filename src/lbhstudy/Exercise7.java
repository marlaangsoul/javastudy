package lbhstudy;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();	
		
		int result = num - (num % 100);
		
		System.out.println(result);
		scan.close();

	}

}
