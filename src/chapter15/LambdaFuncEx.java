package chapter15;

public class LambdaFuncEx {

	public static void main(String[] args) {
		InterfaceEx ie = (int x, int y) -> x+y;
		int sum = ie.sum(0, 0);
		System.out.println(ie.sum(1, 2));

		LamdaInterfaceEx li = () -> {
			String str = "메서드 출력";
			System.out.println(str);
		};
		

	}
	interface LamdaInterfaceEx{
		void pirnt();
	}
	
	interface InterfaceEx{
		public int sum(int x, int y);
	}


}
