package day7.homework;

public class StarEx5 {

	public static void main(String[] args) {
		/* 다음과 같이 출력되도록 코드를 작성 하세요.
		 *           *
		 * 			***
		 * 		   *****
		 * 		  *******
		 * 		   *****
		 * 			***
		 * 			 *
		 */
		
		int i,j;
		/* 외부 반복문
		 * 반복 횟수 : i는 1부터 5까지 1씩 증가
		 * 규칙성 : * i개를 출력 후 엔터
		 * 반복문 종료 후 : 없음
		 */
		for(i = 1; i <= 5; i++) {
			//공백을 출력
			/* 내부 반복문
			 * 반복 횟수 : j는 ?부터 ?까지 ?씩 증가
			 * 규칙성 : ' ' 출력
			 */
			for(j = 1; j <= 5-i; j++) {
			System.out.print(" ");
			/* 내부 반복문
			 * 반복 횟수 : j는 1부터 i까지 1씩 증가
			 * 규칙성 : *을 출력
			 */
			}
			for(j = 1; j <= i; j++) {
				System.out.print("*");
			}
			//* i-1개를 출력
			for(j = 1; j <= i-1; j++) {
				System.out.print("*");
			}
			//엔터
			System.out.println();
		}
		for(i = 4; i >= 1; i--) {
			for(j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for(j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}