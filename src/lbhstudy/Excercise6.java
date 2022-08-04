package lbhstudy;

import java.util.Scanner;

public class Excercise6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 입력해주세요");
		int price = scan.nextInt();
		
//		int oman = price/50000;
//		int ilan = (price-(oman*50000))/10000;
//		int ochun = (price-(oman*50000)-(ilan*10000))/5000;
//		int ilchun = (price-(oman*50000)-(ilan*10000)-(ochun*5000))/1000;
		int oman = price/50000;
		int ilan = price % 50000 /10000;
		int ochun = price % 10000 /5000;
		int ilchun = price % 5000 /1000;
		
		System.out.println("총 가 격 = " + price+"원");
		System.out.println("오만원권 = " + oman+"장");
		System.out.println("일만원권 = " + ilan+"장");
		System.out.println("오천원권 = " + ochun+"장");
		System.out.println("일천원권 = " + ilchun+"장");
		
		scan.close();
		
		

	}

}
