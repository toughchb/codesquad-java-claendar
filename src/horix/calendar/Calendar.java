package horix.calendar;

import java.util.Scanner;
public class Calendar {
	public static void main(String[] args) {
		System.out.println(" 일   월    화    수    목    금    토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		//숫자를 입력 받아 해당하는 달의 최대 일수를 출력하는 프로그램
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("원하는 월을 입력 하세요(1~12)");
		
		Scanner scanner = new Scanner(System.in);
		/*String s1 = scanner.next();*/
		
		//int inputMonth = Integer.parseInt(s1);
		int inputMonth = scanner.nextInt();
		
		System.out.printf("입력한 %d월은 %d일 까지 있습니다. ",inputMonth,month[inputMonth+1]);
		
		
	}

}
