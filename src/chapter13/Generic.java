package chapter13;

public class Generic<T> {
	T[] v;
	
	void set(T[] n) {
		v = n;
	}
	T[] get() {
		return v;
	}
	
	void print() {
		for(T o : v) {
			System.out.println(o + "");
		}
		System.out.println();
	}
	

}
