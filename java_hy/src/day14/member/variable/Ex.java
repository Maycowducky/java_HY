package day14.member.variable;

public class Ex {

	public static void main(String[] args) {
		/*멤버 변수 초기화 예제 
		 *객체 클래스 멤버변수 num 초기화 순서
		 * 1. 기본값 : int의 기본값이 0으로 초기화
		 * 2. 명시적 초기화 : 멤버변수 선언과 동시에 초기화 되는 값 → 1
		 * 3. 초기화 블록 : {}로 된 초기화 블록에서 초기화 → 2
		 * 4. 생성자 : 생성자에서 초기화 → 3
		 */
		System.out.println(TestA.num2);
		
		TestA a = new TestA();
		System.out.println(a.num);
		
		System.out.println(TestA.num2);
	}

}
class TestA{
	//명시적 초기화
	int num = 10;
	
	{ //초기화 블록
		num = 2;
	} //초기화 블록
	public TestA() {
		num = 3;
		num2 = 3; //의미가 없음 출력이 먼저 되면 2가 나오고 마지막에 하면 3의 값이나옴
	}
	
	static int num2 = 1;
	
	static { //정적 초기화 블록
		num2 = 2;
	}
}