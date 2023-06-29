package day22.lambda;

public class LambdaEx1 {

	public static void main(String[] args) {
		//일반적으로는
		InterfaceA a = new InterfaceA() {
			
			@Override
			public int getMax(int num1, int num2) {
				return num1 >= num2 ? num1 : num2;
			}
		};
		System.out.println(a.getMax(10, 20));
		//람다식일 경우
		InterfaceA b = (num1, num2)->{
			return num1 >= num2 ? num1 : num2;
		};
		System.out.println(b.getMax(10, 20));
	}

}
interface InterfaceA{
	int getMax(int num1, int num2);
}
