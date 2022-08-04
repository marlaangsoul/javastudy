package chapter07;

public class CarMain {
	public static void main(String[] args) {
	Car tico = new Car();
	Car pride = new Car();
	//Heap 에다가 만든다.
	tico.color = "화이트";
	tico.company = "현대";
	tico.type = "경차";
	
	pride.color = "블랙";
	pride.company = "현대";
	pride.type = "경차";
	
	tico.go();
	pride.back();
	
	System.out.println(tico.color);
	System.out.println(tico.company);
	System.out.println(tico.type);
	System.out.println(tico.color);
	System.out.println(tico.company);
	System.out.println(tico.type);
	
	}
	

}
