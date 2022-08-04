package chapter10;

import java.sql.Date;
import java.util.Calendar;

public class CalendarEx4 {

	public static void main(String[] args) {
		
		// 현재일
		int sYear = 2022;
		int sMonth = 3;
		int sDay = 7;
		// 이전일
		int eyear = 1991;
		int eMonth = 2;
		int eDay = 4;

		Calendar sCal = Calendar.getInstance();
		Calendar eCal = Calendar.getInstance();
		sCal.set(sYear, sMonth, sDay);
		eCal.set(sYear, sMonth, sDay);
		
		System.out.println(sCal.getTimeInMillis());
		System.out.println(sCal.getTimeInMillis());
		
		long diffSec = (sCal.getTimeInMillis() - eCal.getTimeInMillis());
		long diffDay = diffSec / (60 * 60 * 24);
		System.out.println(diffDay "살아온 날");

		
//		Date sd = new Date();
//		Date ed = new Date();
//		
//		
//		sd.setYear(sYear);
//		sd.setMonth(eMonth-1);
//		sd.setDate(sDay);
//		
//		ed.setYear(eyear);
//		ed.setMonth(eMonth-1);
//		ed.setDate(eDay);
//		
//		long temp = (sd.getTime() - ed.getTime()) / (1000L * 60L * 60L * 24L);
//		int diff = (int) temp;
//		
//		System.out.println(diff + "일 경과");
		
	}

}
