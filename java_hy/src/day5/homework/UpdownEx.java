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
		int i;
		int min = 1, max = 100;
		int random = (int)(Math.random() * (max - min + 1) + min);
		Scanner sc = new Scanner(System.in);
		System.out.println("input: ");
		System.out.println(random);
		i= sc.nextInt();
		while(i != 3) {
			
			
			switch(i) {
			case 46-100:
				System.out.println("Down!");
				break;
			case 1-44:
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
