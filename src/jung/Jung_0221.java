package jung;

import java.util.Scanner;

public class Jung_0221 {

	public static void main(String[] args) {
		
//		//Scanner 객체.
//		
//		System.out.println("점수를 입력하세요.\n");
//		Scanner scan = new Scanner(System.in);
//		
//		int score = scan.nextInt();
//		String grade = "";
//		switch(score / 10) {
//		case 9 :
//			grade ="A";
//			break;
//		case 8 :
//			grade ="B";
//			break;
//		case 7 :
//			grade ="C";
//			break;
//		case 6 :
//			grade ="D";
//			break;
//		case 5 :
//			grade ="E";
//			break;
//		case 4 :
//			grade ="F";
//			break;
//			default :
//				grade = "탈락";
//				
//		}
//		System.out.println("학점은 " + grade);			
//
//		int number = 3;
//		
//		switch(number) {
//		case 1:
//			System.out.println("1번");
//			break;
//		case 2:
//			System.out.println("2번");
//			break;
//		case 3:
//			System.out.println("3번");
//			break;
//		case 4:
//			System.out.println("4번");
//			break;
//		case 5:
//			System.out.println("5번");
//			break;
//		case 6:
//			System.out.println("6번");
//			break;
//		case 7:
//			System.out.println("7번");
//			break;
//		default :
//			System.out.println("8번");
//			
//			
//		}
//		
//		
	int math = 90;
	int eng = 95;
	 
	// 중첩 if문
	if (math >= 60) {
		 if (eng>=60) {
			 System.out.println("통과");
		 }
	 } else {
		 System.out.println("탈락");
	 }
	 //중첩 논리식
	 if(math >=60 && eng >=60) {
		 System.out.println("통과");
	 }else {
		 System.out.println("탈락");
	 }
		
	}

}
