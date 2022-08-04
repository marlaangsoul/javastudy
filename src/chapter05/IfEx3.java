package chapter05;

public class IfEx3 {

	public static void main(String[] args) {

		//		int math = 90;
		//		int eng = 95;
		//		//math, eng 60 이상이면 통과, 아니면 탈락.
		//		
		//		if(math >= 60) { //이럴때. 중첩 if 문이란, if문 안에 if문을 또 만들수 있을까요? 라고 묻는 것. 
		//			if(eng>= 60) {
		//				System.out.println("통과");
		//			}else {
		//				System.out.println("탈락");
		//			}
		//		}else {
		//			System.out.println("탈락");
		//		}
		//
		//		//아래와 같이 && 문으로도 쓸수 있다.
		//		// 그런데 아래와 같이 쓰면, 어떤 부분이 조건에 충족하지 않는 지르 알수가 없다.
		//		int math = 90;
		//		int eng = 95;
		//		//math, eng 60 이상이면 통과, 아니면 탈락.
		//		
		//		if(math >= 60 && eng >= 60) {
		//			System.out.println("통과");
		//		}else {
		//			System.out.println("탈락");
		//		}
		int math = 90;
		int eng = 90;
		int kor = 90;
		//math, eng, kor 60 이상이면 통과, 아니면 탈락.

		if(math >= 60) {
			if(eng >= 60) {
				if(kor >= 60) {
					System.out.println("합격");
				} else {
					System.out.println("국어 점수로 인한 불합격");
				}
			} else {
				System.out.println("영어 점수로 인한 불합격");
			}
		} else {
			System.out.println("수학 점수로 인한 불합격");
		}
		// 위에 것은 완료.
		// 각 점수를 입력하여 뽑을수 있는 프로그램으로 만들자. 



	}

}
