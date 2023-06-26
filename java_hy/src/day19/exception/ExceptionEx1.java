package day19.exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		/* num2의 값이 0이어도 오류가 표시 안됨
		 * 
		 */
		
		int num1 = 1, num2 = 0;
		
		System.out.println(num1/num2);
	}

}
