package day5.whileex;

public class CounterNumberEx {

	public static void main(String[] args) {
		/* 1부터 10까지 출력하는 코드르 작성하세요.
		 * 반복 횟수 :i는 1부터 i가 10까지 1씩 증가
		 * 규칙성 : 
		 */
		int i = 1; //i는 1부터
		while ( i <= 10) { //i는 10까지
			System.out.println(i);
			++i; // i는 1씩 증가
		}
	}
}
