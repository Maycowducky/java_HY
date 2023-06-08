package day7.practice;

public class PrintAlphabetEx {

	public static void main(String[] args) {
		
		// a 부터 z까지 출력하는 코드를 작성하세요.
		// a b c d e f g ... x y z
		char ch = 'a';
		int i;
		/* 'a'에 0을 더하면 'a'
		 * 'a'에 1을 더하면 'b'
		 * 'a'에 2를 더하면 'c'
		 * 'a'에 3을 더하면 'd'
		 * ...
		 * 'a'에 25를 더하면 'z'
		 */
		for (i = 0; i <= 26; i++) {
			System.out.print((char)(ch + i));
		}
		System.out.println(System.lineSeparator() + "==========================");
		/* 반복 횟수 : i 는 0 부터 26보다 작을때 까지 1씩 증가
		 * 규칙성 : 'a'에 i를 더한 값을 문자형으로 자료형변환해서 출력
		 * 반복문 종료 후 : 없음
		 */
		for(ch = 'a'; ch <='z'; ch++) {
				System.out.print(ch);
		/* 문자형 변수 ch++을 하면 char
		 * 반복횟수 : ch는 'a'부터 시작해서 'z'까지 1씩 증가
		 * 규칙성 : ch를 출력
		 * 반복문 종료 후 : 없음
		 */
			}
		}
	}
