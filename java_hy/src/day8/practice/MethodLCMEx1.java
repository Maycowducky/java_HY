package day8.practice;

import java.util.Scanner;

public class MethodLCMEx1 {

	public static void main(String[] args) {
		/*정수 num1과 num2를 입력받아 두 정수의 최소 공배수를 구하는 코드를 작성하세요.
		 * 단, 메서드 이용할 것.
		 * A: g, B:gb
		 * g: 최대 공약수
		 * l: A*B/g
		 * A*B/g \\ (ga*gb)/g == gab
		 */
	
		int num1, num2, i = 1, LCM = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input 2 numbers: ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		int lcm = LCM(num1,num2);
		
		System.out.println(num1 + " and " + num2 + " LCM: " + lcm);
		
		sc.close();
	}
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
	}		
	public static int LCM(int num1, int num2) {
		for(int i = num1; i <= 1; i++) {
			
			if(isMultiple(num1, i) && isMultiple(num2, i)) {
				return i;
			}
		}
		//없으면 에러 => 
		return 1;
	}
}