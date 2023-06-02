package day3.homework;

import java.util.Scanner;

public class Ex2_If {

	public static void main(String[] args) {
		/*성별(M:남성,W:여성)를 입력받아 M이면 남성을, W이면 여성을 출력하는 코드를 작성하세요.
		 * if문 이용
		 *input gender :
		 *M
		 *Are you a woman? man
		 *W
		 *Are you a woman? woman
		 */
		
		/*Scanner sc= new Scanner(System.in);
		 *	System.out.println("input gender : ");
		 *String gender= sc.nextLine();
	
		 *boolean res = gender.equals("W");
		 *if(res) {
		 *	System.out.println(gender + "는 여자입니다.");	
		 *}else {
		 *	System.out.println(gender + "는 남자입니다.");
	 	 *}
		 *sc.close();
		 * 
		 */
		//출력 2개가 마음에 안들때 
		//String result = "";
		char gender;
		Scanner sc = new Scanner(System.in);
			System.out.println("input gender :");
		gender = sc.next().charAt(0);
		
		//gender가 M과 같다
		//if gender 밑줄에 result = "man";
		//출력에 질문 + result 예:)System.out.println("Are you woman?" + result);
		if(gender == 'M') {
			System.out.println("Are you woman?" + "man");
			
		}
		
		//gender가 W와 같다
		//if gender 밑줄에 result = "woman";
		
		if(gender == 'W') {
			System.out.println("Are you woman?" + "woman");
			
		}
		
		sc.close();
		
		
		}
		
		
	}

