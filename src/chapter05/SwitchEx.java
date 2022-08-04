package chapter05;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// about the switch
		// {
		//    case 값 1 :
		//        행동 1 ;
		//        break ;
		// case 값 2 :
		//        행동 2 ;
		//        break ;
		// ...
		// case 값 n :
		//        행동 n ;
		//        break ;
		// default :
		//        행동 n+1 ;
		// }

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
//		//홀짝을 해보자.
//		int number = 3;
//		switch(number) {
//		case 1 = number % 2 :
//			System.out.println("홀");
//		break;
//		case 0 = number % 2 : 
//			System.out.println("짝");
//		break;
//			
//		}
		// 내가 한것 ....
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 넣으세요 >");
		int number = sc.nextInt();
		int c = number % 2;
		switch(c) {
		case 1:
			System.out.println("홀");
		break;
		case 0: 
			System.out.println("짝");
		break;
			
		}
	






	}

}
