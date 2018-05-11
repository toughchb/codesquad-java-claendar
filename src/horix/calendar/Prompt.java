package horix.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT="cal>";
	public int parseDay(String week) {
		if(week.equals("su")) return 0;
		else if(week.equals("mo") ) return 1;
		else if(week.equals("tu") ) return 2;
		else if(week.equals("we") ) return 3;
		else if(week.equals("th") ) return 4;
		else if(week.equals("fr") ) return 5;
		else if(week.equals("sa") ) return 6;
		
		else
			return 0;
		
	}
	
	public void runPrompt() {
		Calendar cal = new Calendar();// 클래스 내에서 메소드를 쓰기위해서 인스턴스화
		Scanner scanner = new Scanner(System.in);
		//cal.printSampleCalendar();
		
		int inputMonth = 0;
		int inputYear = 2017;
		int weekday = 0;
		
		while (true) {

			System.out.println("원하는 년도을 입력 하세요(exit : -1)");
			System.out.print(PROMPT);
			inputYear = scanner.nextInt();
			
			System.out.println("원하는 월을 입력 하세요(1~12)");
			System.out.print(PROMPT);
			inputMonth = scanner.nextInt();
			
			if ((inputMonth == -1)||(inputYear==-1)) {
				break;
			}
			if(inputMonth > 12 || inputMonth <1) {
				System.out.println("Wrong input");
				continue;
			}
			cal.printCalendar(inputYear, inputMonth);
			//System.out.printf("입력한 %d월은 %d일 까지 있습니다. \n", inputMonth, cal.maxDaysofMonth(inputMonth));
		}
		
		System.out.println("Bye~");
		scanner.close();
		
	}
public static void main(String[] args) {
		
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	
	}

}
