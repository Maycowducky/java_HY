package day3.operator;

public class LogicalEx {

	public static void main(String[] args) {
		int score = 95;
		//성적이(score) 80점이상이고, 성적이 90점 미만인가?
		//score가 80보다 크거나 같고 score가 90보다 작다
		//score가 80보다 크거나 같다 && score가 90보다 작다
		//score >= 80 && score < 90
		//System.out.println(" Is " score + " a B? " + (score >= 80 && score < 90));
		System.out.println(score + "점은 B학점인가? " + (score >= 80 && score < 90));
		int age = 15;
		//20세 이상이면 성인
		boolean isAdult = age >= 20;
		//age는 미성년자인가?
		System.out.println(" Is " + age + " years old a minor? " + !isAdult);
		
		//주민등록증은 있고, 운전면허증이 없음
		boolean hasIDCard = true;
		boolean hasDLCard = false;
		//DLC (Driver's License Card)
		//토익을 볼 수 있을까? (주민등록증이 있거나 운전면허증이 있으면 볼 수 있음)
		System.out.println(" Can I take TOEIC? " + (hasIDCard || hasDLCard) );
		
	}

}
