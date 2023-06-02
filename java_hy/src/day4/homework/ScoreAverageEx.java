package day4.homework;

import java.util.Scanner;

public class ScoreAverageEx {

	public static void main(String[] args) {
		/*국어, 영어, 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요.
		 *성적은 정수.
		 */
		int Lit,Eng,Math;
		Scanner sc= new Scanner(System.in);
		System.out.println("input score: ");
		Lit = sc.nextInt();
		Eng = sc.nextInt();
		Math = sc.nextInt();
		int num = (Lit+Eng+Math)/3;
		System.out.println(num);
		
		sc.close();
	}

}
