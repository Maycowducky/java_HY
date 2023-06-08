package day7.practice;

public class StarEx3 {

	public static void main(String[] args) {
		/*     *	i = 1 / 공 = 4 * = 5
		 *    **	i = 2 / 공 = 3 * = 5
		 *   ***	i = 3 / 공 = 2 * = 5
		 *  ****	i = 4 / 공 = 1 * = 5
		 * *****	i = 5 / 공 = 0 * = 5
		 * 				  공 = 5-i * = i
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
				System.out.print(' ');
			}
			/* 내부 반복문
			 * 반복 횟수 : j는 1부터 i까지 1씩 증가
			 * 규칙성 : *을 출력
			 */
			for(j = 1; j <= i; j++) {
				System.out.print('*');
			}
			//엔터
			System.out.println();
			}
	}
}
