package day13.practice;

public class SubjectEx {

	public static void main(String[] args) {
		Subject sub1 = new Subject("kor");
		sub1.print();
		
		System.out.println("==============");
		
		Subject sub2 = new Subject("eng", 1, 1);
		sub2.updateScore(30, 40, 10);
		sub2.print();
		
		System.out.println("==============");
		
		Subject sub3 = new Subject("math", 1, 1);
		sub3.updateScore(40, 70, 20);
		sub3.print();
	}

}
