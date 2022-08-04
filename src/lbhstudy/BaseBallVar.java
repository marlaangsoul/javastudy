package lbhstudy;

public class BaseBallVar {
	public static void main(String[] args) {
		//야구게임
		//컴퓨터 난수 설정
		String s = "%sS %sB %sO";
		int com1 = 0;
		int com2 = 0;
		int com3 = 0;
		
		while(true) {
			com1 = (int)(Math.random()*10);
			com2 = (int)(Math.random()*10);
			com3 = (int)(Math.random()*10);
			boolean b = (com1 == com2 || com1 == com3 || com2 == com3);
			if(!b) {
				break;
			}
		}
		//중복을 체크해 보자.
		System.out.printf("%s, %s, %s", com1,com2,com3);
		
		
				
				
				
	}

}
