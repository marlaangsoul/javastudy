package chapter06;

import java.util.Arrays;

public class LottoOne {

	public static void main(String[] args) {

		//로또 번호 담을 변수 준비
		//lotto
		// 1 ~ 45 의 숫자 중 중복되지 않는 6개의 숫자를 추출. 하고 저장.
		//1/8000000

//		int lotto1 = (int)(Math.random() * 45) +1;
//		System.out.println(lotto1);
//		int lotto2 = (int)(Math.random() * 45) +1;
//		System.out.println(lotto2);
//		int lotto3 = (int)(Math.random() * 45) +1;
//		System.out.println(lotto3);
//		int lotto4 = (int)(Math.random() * 45) +1;
//		System.out.println(lotto4);
//		int lotto5 = (int)(Math.random() * 45) +1;
//		System.out.println(lotto5);
//		int lotto6 = (int)(Math.random() * 45) +1;
//		System.out.println(lotto6);
//		// >> 여기서 배열을 쓰지 않으면, 문제는 중복체크(조건체크)를 계속 해야 한다.
		int [] lottoOne = new int[6]; //{0,0,0,0,0,0}

		//1번째시도------------- 이 아래를 반복.
		int idx = 0; // 배열의 방 값.
		while(true) {

			// ↓아래 값을 하나 만들고, 이제 while 반복문을 사용하여 반복하자.
			int number = (int)(Math.random()*45)+1; //실제 배열에 넣어야 하는 랜덤 값을 뽑음.

			boolean insert = true; //중복값이 있는지 체크 값
			for(int i = 0; i<idx;i++) {
				if(lottoOne[i] == number ) { // 중복이 있으면
					insert = false;			// 넣지 마라.
					break;
				} 
			}

			if(insert == true) { //중복이 없으면 번호를 넣어라.
				lottoOne[idx] = number;
				idx++;

			}	

			if(idx == 6) break; 
			// -----------------------------
		}
			for (int i = 0; i<lottoOne.length;i++) {
				System.out.println(lottoOne[i]);

			}

		}

	}


