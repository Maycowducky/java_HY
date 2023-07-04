package day25.Test;

public class Test4 {

	public static void main(String[] args) {
		//num가 짝수인지 홀수인지 판별하는 예제
		
				int num = 3;
				
				if(num % 2 == 0)
					System.out.println("짝수");
				
				//else 옆에 ';' 때문에 else문의 실행문이 없음.
				//홀수는 num의 값과 상관 없이 출력
				// ';'을 제거
				else
					System.out.println("홀수");
	}
}