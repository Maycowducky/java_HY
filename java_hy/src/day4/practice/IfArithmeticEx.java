package day4.practice;

import java.util.Scanner;

public class IfArithmeticEx {
	
	public static void main(String[] args) {
		/* 산술 연산자와 두 정수를 입력받아 
		 * 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요.
		 * 예:
		 * input 2 nums and operator :
		 * 1 + 2 [엔터]
		 * 1 + 2 = 3
		 * input 2 nums and operator :
		 * 1 ? 2 [엔터]
		 * ? is not arithmetic operator!
		 * 산술연산자 : op
		 * op 가 +이면 num1 + num 2를 출력하고
		 * op 가 -이면 num1 - num 2를 출력하고
		 * op 가 *이면 num1 * num 2를 출력하고
		 * op 가 /이면 num1 / num 2를 출력하고
		 * op 가 %이면 num1 % num 2를 출력하고
		 * op 가 산술연산자가 아니면 op is not arithmetic operator! 를 출력
		 */
	int num1, num2;
	char operator;
	Scanner sc = new Scanner(System.in);
		System.out.println("input 2 nums and operator(ex : 1 + 2) :");
	
	num1 = sc.nextInt();
	operator = sc.next().charAt(0);
	num2 = sc.nextInt();
	
	//이 아이를 없애고 밑에 출력문 입력
	int sum = num1 + num2;
	int sub = num1 - num2;
	int mul = num1 * num2;
	double div = num1 / (double)num2;
	int mod = num1 % num2;
	
	/*
	 * System.out.println(num1 + " " + op + " " 
	 * + num2 + " = " + (num1 + num2));
	 */
	if(operator == '+') {
		System.out.println("" + num1 + " + " + num2 + " = " + sum);
	}
	/*
	 * System.out.println(num1 + " " + op + " " 
	 * + num2 + " = " + (num1 - num2));
	 */
	else if(operator == '-') {
		System.out.println("" + num1 + " - " + num2 + " = " + sub);
	}
	/*
	 * System.out.println(num1 + " " + op + " " 
	 * + num2 + " = " + (num1 * num2));
	 */
	else if(operator == '*') {
		System.out.println("" + num1 + " * " + num2 + " = " + mul);
	}
	/*
	 * System.out.println(num1 + " " + op + " " 
	 * + num2 + " = " + ((double)num1 / num2));
	 */
	else if(operator == '/') {
		System.out.println("" + num1 + " / " + num2 + " = " + div);
	}
	/*
	 * System.out.println(num1 + " " + op + " " 
	 * + num2 + " = " + (num1 % num2));
	 */
	else if(operator == '%') {
		System.out.println("" + num1 + " % " + num2 + " = " + mod);
	}
	/*
	 * System.out.println(op + "is not arithmeitc operator!")
	 */
	else {
		System.out.println(" is not arithmetic operator!");
	}
	sc.close();
	
	}
}