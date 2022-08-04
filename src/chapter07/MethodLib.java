package chapter07;

public class MethodLib {

	//멤버 메서드
	//전역 메서드
	//static 아무곳에서나 쓸쑤 있는 것.
	public static char intToChar(int a) {
		char c = ' ';
		c = (char)a;
		return c;
		
	}
	//인스턴스 메서드
	//ex String에서만 쓸수 있는 것. 
	public String intToString(int a) {
		String s = " ";
		s =  a+ "";
		return s;
		
	}
	
	public static String intToString(int a) {
		String s = "";
		s = a+"";
		return s;
		}
	

}
