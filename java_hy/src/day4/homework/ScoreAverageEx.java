package day4.homework;

import java.util.Scanner;

public class ScoreAverageEx {

	public static void main(String[] args) {
		/*국어, 영어, 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요.
		 *성적은 정수.
		 */
		/*int Lit, Eng, Math;
		Scanner sc= new Scanner(System.in);
		System.out.println("input score: ");
		Lit = sc.nextInt();
		Eng = sc.nextInt();
		Math = sc.nextInt();
		int num = (Lit + Eng + Math)/3;
		System.out.println(num);
		
		sc.close();*/
		
		int kor, eng, math;
		double avg;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input score(kor,eng,math) ex : 100 90 80 : ");
		//국어,영어,수학순으로 성적을 입력
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		//평균을 계산 /변수로 되어있다면 (double)3.0; double 로 형변환 가능.
		avg = (kor + eng + math) / 3.0;
		
		//평균을 출력
		System.out.println("avg : " + avg);
		sc.close();


	}

}
