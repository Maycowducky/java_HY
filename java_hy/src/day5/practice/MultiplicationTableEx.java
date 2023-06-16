package day5.practice;

import java.util.Scanner;

public class MultiplicationTableEx {

	public static void main(String[] args) {
		/*	2 x 1 = 2
		 * 2 x 2 = 4
		 * ...
		 * 2 x 9 = 18
		 * 반복횟수 : i는 1부터 9까지 1씩 증가
		 * 규칙성 : 2 x i = 2*i를 출력
		 */
		int i;
		Scanner sc = new Scanner(System.in);
			System.out.println("input number: ");
		i=sc.nextInt();
		while (i <= 9) {
			System.out.println("2 X " + i + " = " + 2 * i);
			i++;
		}
		sc.close();
	}

}
