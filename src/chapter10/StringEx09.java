package chapter10;

public class StringEx09 {

	public static void main(String[] args) {
		String str1 = new String("abcd");
		String str2 = new String("abcd");
		System.out.println("str1="+System.identityHashCode(str1));
		System.out.println("str2="+System.identityHashCode(str2));
		System.out.println(str1);
		System.out.println(str2);
		
		
		str1 = str1 + "efg";
		System.out.println("str1="+System.identityHashCode(str1));
		System.out.println(str1);

	}

}
