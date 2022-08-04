package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Circle(3.0));
		list.add(new Circle(5.0));
		list.add(new Rectangle(3,4));
		list.add(new Rectangle(5,6));
		
		// area 합계
		double sum = sumArea(list);
		double length = sumLength(list);
		
		System.out.println("area:" + Math.round(sum));
		System.out.println("length:" + Math.round(length));
	}
	
	static double sumLength(List list) {
		double sum = 0;
		for(int i=0;i<list.size();i++) {
			Shape c1 = (Shape)list.get(i);
			sum = sum + c1.length();
		}
		return sum;
	}

	static double sumArea(List list) {
		double sum = 0;
		for(int i=0;i<list.size();i++) {
			Shape c1 = (Shape)list.get(i);
			sum = sum + c1.area();
		}
		return sum;
	}
	

}
