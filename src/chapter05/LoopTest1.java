package chapter05;

public class LoopTest1 {

	public static void main(String[] args) {
		//중첩 반복을 써서 해결해라.
		/*

		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		 */

		//for문 2개.
		
		int i = 0;
		int j = 0;	
		for(j=0;j<5;j++) {
			for(i=0;i<5;i++) {
				System.out.print("*");
			}
			System.out.println("");

			}
		 
		
		//for 문 1개로 *을 5개 쓰는 법.
		/*
		int i = 0;
		for(i =0; i<5;i++) {
			System.out.print("*****\n");
			*/
		
		//for 1개로 만들기.
		/*
		int j = 0;		
		for(int i=0; i<25; i++) {
			System.out.print("*");
			j++;
			if(j % 5 ==0) {
				System.out.print("\n");
			}
			*/
			
		}






	}


