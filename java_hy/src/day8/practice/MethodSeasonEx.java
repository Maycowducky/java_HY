package day8.practice;

import java.util.Scanner;

public class MethodSeasonEx {

	public static void main(String[] args) {
		/* 월을 입력받아 계절을 출력하는 코드를 작성하세요.
		 * Spring : 3, 4, 5
		 * Summer : 6, 7, 8
		 * Fall	  : 9, 10, 11
		 * Winter : 12, 1, 2
		 * Wrong Month: 그 외
		 */
	
		int mon;
		Scanner sc = new Scanner(System.in);
		System.out.println("input month: ");
		mon = sc.nextInt();
		
		String season = getSeason(mon);
		System.out.println(mon + " is " + season);
		
		System.out.println(mon + " is " + getSeason(mon));
		
		sc.close();
	}
	/**월이 주어지면 주어진 월에 맞는 계절을 알려주는 Method
	 * 매개변수 : 월 => int mon
	 * 리턴타입 : 계절 => String
	 * 메서드명 : getSeason
	 */
	public static String getSeason(int mon) {
		//month가 3이거나 4이거나 5이면 Spring 출력
				//if(mon = 3 || mon = 4 || mon = 5) => 이렇게 사용가능
		if(mon >= 3 && mon <= 5) {
			return "Spring";
		}
		//month가 6이거나 7이거나 8이면 Summer 출력
		else if(mon >= 6 && mon <= 8) {
			return "Summer";
		}
		//month가 9이거나 10이거나 11이면 Fall 출력
		else if(mon >= 9 && mon <= 11) {
			return "Fall";
		}
		//month가 12이거나 1이거나 2이면 Winter 출력
		else if(mon == 12 || (mon >= 1 && mon <= 2)) {
			return "Winter";
		}
		//아니면 Wrong Month 출력
		else {
			return "Wrong Month";
		}
	}
}