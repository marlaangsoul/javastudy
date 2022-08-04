package chapter05;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("점수 입력 >>");
//		
		int score = 98;
		String grade = "";
		
		System.out.println("학점부여 시작");
		if (score >= 95) {
			grade = "A+";
		} else if (score >= 90) {
			grade = "A";
		} else if (score >= 85) {
			grade = "B+";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else { //else는 여기에 들어가지 않는 모든 것들을 뜻한다.
			grade = "F";
		}
		
		System.out.println("당신의 학점은 "+grade+"입니다.");
		System.out.println("학점부여 끝");
				
		

	}

}
