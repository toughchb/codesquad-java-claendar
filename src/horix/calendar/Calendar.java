package horix.calendar;


public class Calendar {
	private static final int[] MAX_DAYS= {31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] LEAP_MAX_DAYS= {31,29,31,30,31,30,31,31,30,31,30,31};
	public boolean isLeapYear(int year) {
		if(year % 4 ==0 && (year %100 !=0 || year % 400 == 0))
			return true;
		else
			return false;
	}
	
	public int maxDaysofMonth(int year,int month) {
		if(isLeapYear(year)) {
			return LEAP_MAX_DAYS[month -1];
		}
		else {
		return MAX_DAYS[month-1];
		}
	}
	
	public void printCalendar(int year,int month) {
		System.out.printf("    <<%d년  %d월>>\n",year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("--------------------");
		
		int weekday = getWeekDay(year, month,1);
		
		//print blank space
		for(int i =0; i<weekday;i++) {
			System.out.print("   ");
		}
		
		int maxDay = maxDaysofMonth(year, month);
		int count = 7 - weekday;
		int delim = count;
		
			for (int i = 1; i<= maxDay; i++) {
			System.out.printf("%3d",i);
			if((i+weekday) % 7 == 0)
				System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	private int getWeekDay(int year, int month, int day) {
		//기준 날짜 요일을 1970 년 1월 1일 목요일 부터
		int syear = 1970;
		int smonth = 1;
		int sday = 1;
		int sweekday = 3;
				
		int count = 0;
		for(int i = syear; i < year; i++)
		{
			int delta = isLeapYear(year) ? 366 : 365;
			count += delta;
			
		}
		System.out.println();
		return 0;
	}

}
