package day5.homework;

import java.util.Scanner;

public class UpdownEx {

	public static void main(String[] args) {
		/*1-100사이의 랜덤한 정수를 생성하고, 이 정수를 맞추는 게임을 구현하세요.
		 * 랜덤한 수 : 45
		 * input : 50
		 * Down!
		 * input : 40
		 * Up!
		 * input : 45
		 * Good!
		 */
		int i = 0;
		Scanner sc = new Scanner(System.in);
		while(i != 3) {
			System.out.println("input: ");
			i= sc.nextInt();
			switch(i) {
			case 50:
				System.out.println("Down!");
				break;
			case 40:
				System.out.println("Up!");
				break;
			case 45:
				System.out.println("Good!" + " Program Exit!");
				break;
			}
		}
		sc.close();
	}

}
