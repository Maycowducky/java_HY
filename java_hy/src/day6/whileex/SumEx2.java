package day6.whileex;

import java.util.Scanner;

public class SumEx2 {

	public static void main(String[] args) {
		//n을 입력 받아 1부터 n까지 짝수의 합을 구하는 코드를 작성하세요. (n은 10)
		/* 반복횟수 : i는 1부터 n까지 1씩 증가
		 * 규칙성 : 
		 * 반복문 종료후 : 누적합인 sum을 출력
		 * input 10
		 * 1~10 even sum: 30
		 */
		int n, i = 1, sum = 0;
		Scanner sc = new Scanner(System.in);
		//n을 입력
		System.out.println("input: ");
		n = sc.nextInt();
		//반복문을 이용하여 n까지 짝수의 합을 계산
		//i가 n보다 작거나 같으면 반복
		
		
		while(i <= n) {
			if(i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		//sum을 출력
		System.out.println("1~" + n + " even sum: " + sum);
		sc.close();
	}

}
