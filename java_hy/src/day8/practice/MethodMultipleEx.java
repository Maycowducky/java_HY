package day8.practice;

import java.util.Scanner;

public class MethodMultipleEx {

	public static void main(String[] args) {
		/* 정수 num를 입력받아 2,3,6의 배수인지 아닌지 판별하는 코드를 작성하세요.
		 * 단, method를 이용할 것.
		 */
		//System.out.println(MethodEvenNumberEx.is.Multiple(4, 2));
		int num1;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 nums and op (ex:1 * 2)");
		
		num1 = sc.nextInt();
		op = sc.next().charAt(0);
		
		if(num1 % 6 == 0) {
			System.out.println("is multiple of 6");
		}
		else if(num1 % 3 == 0) {
			System.out.println("is multiple of 3");
		}
		else if(num1 % 2 == 0 ) {
			System.out.println("is multiple of 2");
		}
		else {
			System.out.println("is not multiple of 2, 3 ,6.");
		}
		if(isMul6(num1, 6)) {
			System.out.println("is multiple of 6");
		}
		else if(isMul2(num1, 2)) {
			System.out.println("is multiple of 2");
		}
		else if(isMul3(num1, 3)) {
			System.out.println("is multipe of 3");
		}
		else {
			System.out.println("is not multiple of 2,3,6");
		}
			sc.close();
	}
	/**num가 주어지면 num가 짝수인지 홀수인지 출력하는 메서드
	 * @param num : 판별할 정수 int num1, int num2
	 * @return boolean
	 * 메서드명 : isMult6
	 */
	public static boolean isMul6(int num1, int num2) {
		return num1 % num2 == 0;
	}
	/**num가 주어지면 num가 짝수인지 홀수인지 출력하는 메서드
	 * @param num : 판별할 정수 int num1, int num2
	 * @return boolean
	 * 메서드명 : isMult3
	 */
	public static boolean isMul2(int num1, int num2) {
		return num1 % num2 == 0;
}
	/**num가 주어지면 num가 짝수인지 홀수인지 출력하는 메서드
	 * @param num : 판별할 정수 int num1, int num2
	 * @return boolean
	 * 메서드명 : isMult2
	 */
	public static boolean isMul3(int num1, int num2) {
		return num1 % num2 == 0;
	}
}
