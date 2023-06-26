package day19.practice;
import java.util.Scanner;

public class ArithmeticEx {

	public static void main(String[] args) {
	// 두 정수와 산술연사자를 입력했을 때 연산 결과를 출력하는 코드를 작성하세요.
	//예외처리도 추가
		/* input : 1 + 2
		 * 1 + 2 = 3
		 * input : 1 ? 2
		 * Not operator!
		 * input : 1 / 0
		 * Not operator!
		 */
		int num1, num2;
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.print("input: ");
		num1 = sc.nextInt();
		operator = sc.next().charAt(0);
		num2 = sc.nextInt();
		
		int sum = num1 + num2;
		
		if(operator == '+') {
		System.out.println("" + num1 + " + " + num2 + " = " + sum);
		
		}else if(operator == '?') {
		System.out.println("Not operator!");
		
		}else if(operator == '/') {
			System.out.println("Not operator!");
		try {
			System.out.println(1 / 0);
		}catch(ArithmeticException e){
			System.out.println("예외처리를 합니다.");
			
			}
		}
		sc.close();
	}

}
