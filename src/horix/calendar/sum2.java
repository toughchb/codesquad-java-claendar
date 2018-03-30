package horix.calendar;

import java.util.Scanner;

public class sum2 {
	public static void main(String[] args) {
		System.out.println("두수를 입력 하세요");
		int a,b;
		Scanner scanner = new Scanner(System.in);
		
		String s1 = scanner.next();
		String s2 = scanner.next();
		System.out.println(s1 + ", "+ s2);
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		//System.out.println(a + ", " + b);
		//int c = a+b;
		//System.out.println("두수의 합은 "+ (a + b) + "입니다.");
		System.out.printf("두수의 합은 %d 입니다.",a+b);
		scanner.close();
			
	}

}
