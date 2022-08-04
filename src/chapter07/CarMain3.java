package chapter07;

public class CarMain3 {
	public static void main(String[] args) {
		Car2 car1 = new Car2();
		System.out.println(car1.color);
		System.out.println(car1.company);
		System.out.println(car1.type);
		System.out.println("==============");
		
		Car2 car2 = new Car2();
		System.out.println(car2.color);
		System.out.println(car2.company);
		System.out.println(car2.type);
		System.out.println("==============");
		
		
		Car2 car3 = new Car2();
		System.out.println(car3.color);
		System.out.println(car3.company);
		System.out.println(car3.type);
		System.out.println("==============");
		
		Car2 car4 = new Car2("Black");
		System.out.println(car4.color);
		System.out.println(car4.company);
		System.out.println(car4.type);
		System.out.println("==============");
		
		
		
		
		
	}

}
