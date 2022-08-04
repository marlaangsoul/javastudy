package lbhstudy;

public class PrintfTest {

	public static void main(String[] args) {
		System.out.println("윤동주");
		System.out.println("서시");
		System.out.println("죽는 나까지 하늘을 우러러");
		System.out.println("한 점 부끄럼이 없기를");
		System.out.println("잎새에 이는 바람에도");
		System.out.println("나는 괴로워했다.");
		System.out.println("별을 노래하는 마음으로");
		System.out.println("모든 죽어가는 것을 사랑해야지");
		System.out.println("그리고 나한테 주어진 기을");
		System.out.println("걸어가야겠다.");
		System.out.println("========================");
		System.out.printf("%s \n","윤동주");
		System.out.printf("%s \n","서시");
		System.out.printf("죽는 날까지 %s을 우러러 \n","하늘");
		System.out.printf("%d 점 부끄럼이 없기를 \n", 1);
		//숫자는 그냥 1로 하면 되는지?? >> 된다.
		System.out.printf("%s에 이는 %s에도 \n", "잎새","바람");
		System.out.printf("%s는 괴로워 했다. \n", "나");
		System.out.printf("%s을 %s하는 %s으로 \n", "별","노래","마음");
		System.out.printf("%s 죽어가는 것을 %s해야지 \n", "나","길");
		System.out.printf("걸어가야겠다. \n");


		// TODO Auto-generated method stub

	}

}
