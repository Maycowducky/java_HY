package day4.practice;

import java.util.Scanner;

public class IfAdultEx {

	public static void main(String[] args) {
		//나이를 입력받아 나이가 20세 이상이면 adult를 출력하고, 
		//20세 미만이면 minor로 출력하는 코드를 작성하세요.
		//if else문 이용
		/*int age;
		 *Scanner sc = new Scanner(System.in);
		 *System.out.println("Enter Age :");
		 *age = sc.nextInt();
		 *If(age가 20세이상이다){
		 *If(age >=20) {
		 *System.out.println("adult!");
		 *}
		 *else {
		 *System.out.println("minor!");
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age :");
		int age = sc.nextInt();
		boolean result = age >=20;
		
		//나이가 20세 이상이면 adult를 출력하고
		//아니면 minor로 출력
		if(result){
			System.out.println("adult");
		}else {
			System.out.println("minor");
		}
		
		sc.close();
		
	}

}
