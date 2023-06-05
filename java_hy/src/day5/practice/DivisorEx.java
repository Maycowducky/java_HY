package day5.practice;

import java.util.Scanner;

public class DivisorEx {

	public static void main(String[] args) {
		/*정수 num의 입력받아 num의 약수를 구하는 코드를 작성하세요.
		 * 약수 : A 를 B 로 나누었을때 나머지가 0이면 B는 A의 약수이다.
		 * 12의 약수 : 1, 2, 3, 4, 6, 12
		 *반복 횟수 : 1부터 num까지 1씩 증가
		 *규칙성 : num가 i의 약수이면 i를 출력
		 *		→num를 i로 나누었을때 나머지가 0과 같다면 i를 출력
		 */
		int n ,i;
		Scanner sc = new Scanner(System.in);
			System.out.println("input positive number: ");
		n = sc.nextInt();	
		//정수를 입력
		i = 1; n = 12;
		//반복문, i는 1부터 num가지 1씩 증가.
		while (i <= n) {
		//num를 i로 나누었을때 나머지가 0과 같다면 i를 출력
			if (n % i == 0) {
				System.out.println(i);
			}
			i++;
			}
		sc.close();	
		}
	}
