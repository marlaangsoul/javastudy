package chapter05;

public class FlowTest10 {

	public static void main(String[] args) {
		
		String regNo = "111111-2111111"; //1,3 남자 2,4 여자.
		//String은 객체. 객체형에서는 도움이 되는 메소드가 있다.
		//문자열에서 몇번째의 숫자를 가져와~ 하는 메소드가 있다.
		//코딩에서 index(문자순서)는 0부터 시작한다. 단- R만 1부터 시작.
		//7index를 가져와라.
		char y = regNo.charAt(7);//메소드 함수는 항상 소문자대와 가로로 이루어져 있다.
		//1,3 남 - 2,4 여 - 혹시 외국인?
		if (y == '1' || y =='3') {
			System.out.println("남");
		}else if(y == '2' || y == '4') {
			System.out.println("여");
		}else {
			System.out.println("외국인");
		}

	}

}
