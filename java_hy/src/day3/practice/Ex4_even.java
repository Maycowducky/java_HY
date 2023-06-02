package day3.practice;

import java.util.Scanner;

public class Ex4_even {

	public static void main(String[] args) {
		/*정수 num을 입력받아 num이 홀수인지 짝수인지 판별하는 코드를 작성하세요.
		 * num을 2로 나누었을 때 나머지가 0이 아니면 odd number라고 출력
		 * num을 2로 나누었을 때 나머지가 0이면 even number라고 출력
		 */
		int num;
		Scanner sc = new Scanner(System.in);
			System.out.println("input number : ");
		num = sc.nextInt();
		
		/* num를 2로 [나누었을 때 나머지가] 0이 아니다)
		 * num % 2 != 0)
		 */
		
		/* 강사님 예:)
		 * if num % 2 !=0) {
		 * System.out.println(num + " is a even number.");
		 * if num % 2 ==0) {
		 * System.out.println(num + " is a odd number.");
		 */
		
		if(num %2 == 0) {
			System.out.println(num + " is a even number.");
		}
		
		else{
			System.out.println(num + " is a odd number.");
		}
			
		sc.close();
	}
}
