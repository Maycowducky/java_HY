package day5.whileex;

public class HelloWorldEx {

	public static void main(String[] args) {
		//Hello World를 10번 출력하는 코드를 작성.
		/*반복 횟수 : 10번 1번부터 10번까지 1씩 증가
		 * →변수의 초기값 : 1
		 * →조건식 : 10 → 10보다 작거나 같을때 까지
		 * →증가하는 식 : 1
		 *규칙성 : Hello World를 출력
		 */
		int max = 10;
		int i = 1; //변수의 초기값 : 1
		//i 가 10보다 작거나 같을 때 까지
		while(i <= max) {
			System.out.println("Hello World!");
			++i;//1씩 증가 i++, i = i+1, i+=1 도 가능
		}
		System.out.println("===================");
		/*반복 횟수 : i 는 10부터 1까지 1씩 감소
		 */
		i = max;
		while (i >= 1) {
			System.out.println("Hello World!");
			--i;
		}
		System.out.println("===================");
		i = max;
		while (i-- > 0) {
			System.out.println("Hello World!");
		}
	}

}
