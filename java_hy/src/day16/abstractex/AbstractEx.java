package day16.abstractex;

public class AbstractEx {

	public static void main(String[] args) {
		
		
	}

}
/* 추상 클래스는 추상 메서드를 가지고 있음.
 * 추상 메서드가 있는 클래스에 abstract를 붙이지 않으면 에러 발생. 
 */
abstract class A {
	
	public abstract void test();
	
}
/* 추상 클래스 상속 받는 방법 1
* 추상 클래스 A를 상속 받은 자식 클래스는 추상 클래스로 만들어야함.*/
abstract class ChildA1 extends A{
	public abstract void test();
	
}
/* 추상 클래스 상속 받는 방법 2
 * 부모 클래스의 추상 메서드를 오버라이딩해서 재정의 해줌.*/
class ChildA2 extends A{

	@Override
	public void test() {
		System.out.println("TEST");
	}
	
}