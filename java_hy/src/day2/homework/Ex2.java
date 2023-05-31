package day2.homework;

public class Ex2 {

	public static void main(String[] args) {
		//두 정수를 입력받아 두 정수의 산술 연산 결과를 출력하는 코드를 작성하세요. 단, 2번째 숫자는 0이 아님.
		/*
		 * 예:
		 * 두 정수를 입력하세요
		 * 1 2 [엔터]
		 * 1 + 2 = 3
		 * 1 - 2 = -1
		 * 1 * 2 = 2
		 * 1 / 2 = 0.5
		 * 1 % 2 = 1
		 */
		
		int num3 = 2, num4 = 4;
		int sum = num3 + num4;
		int sub = num3 - num4;
		int mul = num3 * num4;
		double div = (double)num3 / num4;
		int mod = num3 % num4;
		System.out.println("" + num3 + '+' + num4 + "=" + sum);
		System.out.println("" + num3 + '-' + num4 + "=" + sub);
		System.out.println("" + num3 + '*' + num4 + "=" + mul);
		System.out.println("" + num3 + '/' + num4 + "=" + div);
		System.out.println("" + num3 + '%' + num4 + "=" + mod);
	}

}
