package day6.nestedloop;

public class MultiplicationTableEx {

	public static void main(String[] args) {
		//구구단 2단부터 9단까지 출력하는 코드를 작성하세요.
		
		/* 외부 반복문
		 * 반복횟수: i는 2부터 9까지 1씩 증가. A:2 B:9
		 * 규칙성: i단이 출력
		 */
		int i,j = 1;
		for(i = 2; i <= 9; i++) {
			//i단 출력
			/*내부 반복문
			 * 반복횟수:j는 1부터 9까지 1씩증가.
			 * 규칙성:j단이 출력
			 */
			for(j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
		//이 위치에서 i와 j의 값은 얼마? i: 10, j: 10;
		System.out.println("i : " + i + ", j : " + j);
	}

}
