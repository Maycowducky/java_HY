package chapter1;

public class Variables {

	public static void main(String[] args) {
		
		String name = "메이";
		int hour = 15;
		
		System.out.println(name + "님, 배송이 시작됩니다." + hour +"시에 방문 예정입니다.");
		System.out.println(name + "님, 배송이 완료되었습니다.");
		System.out.println();
		double score = 90.5;
		char grade ='A';
		name = "강백호";
			System.out.println(name + "님의 평균 점수는 " + score +"점 입니다.");
			System.out.println("학점은" + grade + "입니다.");	
			System.out.println();
		boolean pass= true;
		System.out.println("이번 시험에 합격 했을까요? " + pass);
		System.out.println();
		
		double d = 3.14123456789;
		float f = 3.14123456789F;
		System.out.println(d);
		System.out.println(f);
		System.out.println();
		
		long l = 1000000000000L;
		l = 1_000_000_000_000L;
		System.out.println(l);
		
		/*
		int: 숫자
		long: 긴숫자
		float,double: 소수점 
		char,String : 문자열
		boolean: true / false
		*/
	}
}
