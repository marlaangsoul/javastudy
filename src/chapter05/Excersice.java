package chapter05;

public class Excersice {
	public static void main(String[] args) {

		String s = "*";
		
		for(int jul = 0; jul<4; jul++){
			for(int i = 0; i<3-jul; i++){
				System.out.print(" "); 
			}
			for(int i = 0; i<2*jul+1; i++){
				System.out.printf(s); 
			}
			System.out.println("");
		}
	}
}



//for(int j=0; j<3-1; j++){

//String s = "*";
//
//for (int i = 0; i < 5; i++) {
//	for (int j = 0; j < i+1; j++) {
//		System.out.print(s);    
//	}
//	System.out.println();}

