package day5.practice;

import java.util.Scanner;

public class PrintMenuEx {

	public static void main(String[] args) {
		/*다음과 같은 메뉴를 출력하고 프로그램 종료를 선택하기 전까지 반복적으로
		 * 실행되는 코드
		 * Menu
		 * 1. Start
		 * 2. Save
		 * 3. Exit
		 * Select Menu:
		 * 2
		 * Program Save!
		 * Menu
		 * 1.Start
		 * 2.Save
		 * 3.Exit
		 * Select Menu
		 * 3.
		 * Program Exit!
		 */
		/*메뉴를 출력하는 예제
		 * 반복횟수 : menu 가 3이 아닐때까지
		 * 규칙성 :
		 * -메뉴를 출력
		 * -메뉴를 입력
		 * -입력받은 메뉴에 따라 콘솔에 출력
		 *   -입력받은 메뉴가 1이면 Program Start!
		 *   -입력받은 메뉴가 2이면 Program Save!
		 *   -입력받은 메뉴가 3이면 Program Exit!
		 */
		int i = 0; // 3이 아닌 값으로 초기화
		Scanner sc= new Scanner(System.in);
		while(i != 3) {
			// 메뉴를 출력
			System.out.println("Menu" + System.lineSeparator() + "1.Start" + System.lineSeparator() + "2.Save" + System.lineSeparator() + "3.Exit" + System.lineSeparator() + "Select Menu:");
			//개 개인으로 출력가능
			
			// 메뉴를 입력
			i = sc.nextInt();
			//입력받은 메뉴에 따라 콘솔에 출력
			//입력받은 메뉴가 1이면 Program Start!
			switch(i) {
			case 1:
				System.out.println("Program Start!");
				break;
			//입력받은 메뉴가 2이면 Program Save!
			case 2:
				System.out.println("Program Save!");
				break;
			//입력받은 메뉴가 3이면 Program Exit!
			case 3:
				System.out.println("Program Exit!");
				break;
			}
			
		}
		sc.close();
	}

}
