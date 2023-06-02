package day3.homework;

import java.util.Scanner;

public class Ex1_Conditional2 {

	public static void main(String[] args) {
		/*성별(M:남성,W:여성)를 입력받아 M이면 남성을, W이면 여성을 출력하는 코드를 작성하세요.
		 *input gender :
		 *M
		 *Are you a woman? false
		 *W
		 *Are you a woman? true 
		 */
		
		char gender;
		Scanner sc= new Scanner(System.in);
			System.out.println("input gender :");
		gender = sc.next().charAt(0);
		boolean result = gender != 'W' ? true : false;
			System.out.println("Are you a woman?" + result);
			
		sc.close();
		
		
	}
		
		
}
