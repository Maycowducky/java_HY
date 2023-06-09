package day8.practice;

import java.util.Scanner;

public class MethodEvenNumberEx {

	public static void main(String[] args) {
		//홀짝 판별 예제. 메서드 이용
		/* 정수 num를 입력 받아 짝수인지 아닌지 판별하는 코드를 작성하세요.
		 * 단, Method 이용할 것.
		 */
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("input number: ");
		num1 = sc.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("Even Number.");
		} else {
			System.out.println("Odd Number.");
		}
		printEvenNumber(num1);
		
		if(mod(num1,2) == 0) {
			System.out.println("Even number.");
		}else {
			System.out.println("Odd Number.");
		}
		if(isEvenNumber(num1)) {
			System.out.println("Even number.");
		}else {
			System.out.println("Odd Number.");
		}
		if(isMultiple(num1, 2)) {
			System.out.println("Even number.");
		}else {
			System.out.println("Odd Number.");
		}
		sc.close();
	}
	/**num가 주어지면 num가 짝수인지 홀수인지 출력하는 메서드
	 * @param num : 판별할 정수
	 * @return 없음 => void
	 * 메서드명 : printEvenNumber
	 */
	public static void printEvenNumber(int num) {
		if(num % 2 == 0) {
			System.out.println("Even Number.");
		} else {
			System.out.println("Odd Number.");
		}
		
	}
	/** num1과 num2가 주어지면 num1을 num2로 나누었을 때 나머지를 알려주는 메서드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 나누었을때 나머지 => 정수 => int
	 * 메서드명 : mod
	 */
	public static int mod(int num1, int num2) {
		return num1 % num2;
	}
	/** num가 주어지면 num가 짝수인지 홀수인지 알려주는 메서드
	 * 매개변수 : 판별할 정수 => int num
	 * 리턴타입 : 짝수인지 홀수인지 =>
	 * 메서드명 : isEvenNumber
	 */
	public static boolean isEvenNumber(int num) {
		return num % 2 == 0;
	}
	/** num1과 num2가 주어지면 num1 이 num2의 배수인지 아닌지 알려주는 메서드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 배수인지 (참) 아닌지 (거짓) => boolean
	 * 메서드명 : isMultiple
	 */
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
	}
} 
