package chapter13;

public class GenericEx3 {

	public static void main(String[] args) {
		
		Generic2<String, Integer> gen1 = new Generic2<String, Integer>();
		gen1.set("홍길동",1111);
		
		System.out.println("<String, Integer>");
		System.out.println("name : "+gen1.getName());
		System.out.println("id : "+gen1.getId());
		
		Generic2<String, String> gen2= new Generic2<String, String>();
		gen2.set("이순신", "A1111");
		System.out.println("<String, Stirng>");
		System.out.println("name : "+gen2.getName());
		System.out.println("id : "+gen2.getId());
		
		
		

	}

}
