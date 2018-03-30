package horix.calendar;

import java.util.Scanner;
public class Calendar {
	private static final int[] MAX_DAYS= {31,28,31,30,31,30,31,31,30,31,30,31};
	public int maxDaysofMonth(int month) {
		return MAX_DAYS[month-1];
	}
	public void printSampleCalendar() {
		System.out.println(" 일   월    화    수    목    금    토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static void main(String[] args) {
		
		
		//숫자를 입력 받아 해당하는 달의 최대 일수를 출력하는 프로그램
		String PROMPT = "cal > ";
		Calendar cal = new Calendar();// 클래스 내에서 메소드를 쓰기위해서 인스턴스화
		Scanner scanner = new Scanner(System.in);
		cal.printSampleCalendar();
		int inputMonth = 0;
		
		while (true) {

			System.out.println("원하는 월을 입력 하세요(1~12)");
			System.out.print(PROMPT);
			inputMonth = scanner.nextInt();
			if (inputMonth == -1) {
				break;
			}
			if(inputMonth > 12) {
				continue;
			}
			System.out.printf("입력한 %d월은 %d일 까지 있습니다. \n", inputMonth, cal.maxDaysofMonth(inputMonth));
		}
		
		System.out.println("Bye~");
		scanner.close();
		
	}

}
