package day3.operator;

public class ConditionalEx {

	public static void main(String[] args) {
		//나이가 20세 이상이면 Adult, 아니면 Minor를 출력하는 코드를 작성하세요.
		int age = 10;
		String str;
		
		str = age >= 20 ? "adult" : "minor";
		System.out.println(age + " years old is a " + str);
	}

}
