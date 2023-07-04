package day25.Test;

public class Test6 {

	public static void main(String[] args) {
		//평균 예제
		int kor = 100, eng = 90, math = 34;
		//에러가 발생. 실수를 정수형 변수에 저장하려고 했기 때문에 (자동 형변환이 안되서)-> int를 double로 변경
		double avg = (kor + eng + math)/3.0;
		System.out.println("평균 : " + avg);
	}

}
