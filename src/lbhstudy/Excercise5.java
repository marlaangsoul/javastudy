package lbhstudy;

import java.util.Scanner;

public class Excercise5 {

	public static void main(String[] args) {
		
		//연도를 4로 나누어 떨어지면 윤년
		//100으로 나누어 떨어지면 윤년이 아님
		//400으로 나누어 떨어지면 윤년
		
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = scan.nextInt();
		
		boolean leapYear = (year % 4 == 0 && year % 100!=0)||(year % 400 ==0);
		
		if (leapYear == true) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}
		scan.close();
		
		
		
		

	}

}
