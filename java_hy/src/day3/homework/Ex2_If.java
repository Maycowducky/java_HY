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
		 *Are you a man? woman
		 */
		
		Scanner sc= new Scanner(System.in);
			System.out.println("input gender : ");
		String gender= sc.nextLine();
		
		boolean res = gender.equals("W");
		if(res) {
			System.out.println(gender + "는 여자입니다.");	
		}else {
			System.out.println(gender + "는 남자입니다.");
			}
		sc.close();
		}
		
		
	}

