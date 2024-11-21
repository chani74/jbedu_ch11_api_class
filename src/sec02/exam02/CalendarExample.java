package sec02.exam02;

import java.util.Calendar;
import java.util.Random;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String	strAmPm	= null;
		if (amPm == Calendar.AM ) {
			strAmPm = "오전" ;
		} else {
			strAmPm = "오후" ;
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year+ "년 ");
		System.out.print(month+ "월 ");
		System.out.println(day+ "일 ");
		
		System.out.println(strWeek+ "요일 ");
		System.out.println(strAmPm );
		
		System.out.print(hour+ "시 ");
		System.out.print(minute+ "분 ");
		System.out.println(second+ "초 ");
		
		
		Random random = new Random();
		
		int lotto2 = random.nextInt(45)+1;
		System.out.println("lotto2 = "+lotto2);
		double lotto3 = random.nextDouble(); // 0~1
		System.out.println("lotto3 = "+lotto3);
		
		random.setSeed(0);
		int lotto4 = random.nextInt(45)+1;
		System.out.println("lotto4 = "+lotto4);
		double lotto5 = random.nextDouble(); // 0~1
		System.out.println("lotto5 = "+lotto5); 
		
	}

}
