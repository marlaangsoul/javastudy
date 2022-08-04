package chapter13;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoUserSet {

	public static void main(String[] args) {
		Random n = new Random();
		Set lotto = new HashSet<>();
		while(true) {
			int b = n.nextInt(45) + 1;
			lotto.add(b);
			if(lotto.size() ==6) break;
			
		}
		System.out.println(lotto);
		
		Set lotto2 = new TreeSet();
		while(true) {
			int b = n.nextInt(45) + 1;
			lotto2.add(b);
			if(lotto.size() ==6) break;	
		}
		System.out.println(lotto);
		

	}

}
