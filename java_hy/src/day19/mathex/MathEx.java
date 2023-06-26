package day19.mathex;

public class MathEx {

	public static void main(String[] args) {
		//-1.2의 절대값 abs
		System.out.println(Math.abs(-1.2));
		//1.29의 소수점 첫번째 자리에서 올림 ceil
		System.out.println(Math.ceil(1.29));
		//1.29의. 소수점 첫번째 자리에서 내림 floor
		System.out.println(Math.floor(1.29));
		//1.29의 소수점 첫번째 자리에서 반올림 round
		System.out.println(Math.round(1.29));
		//2의 3제곱 pow
		System.out.println(Math.pow(2, 3));
		//0이상 1미만의 난수 random
		System.out.println(Math.random());
		
		//1.29의 소수점 두번째 자리에서 반올림
		double num = 1.29;
		//소수점 pos자리에서 반올림
		int pos = 2;
		//12.9 Math.pow(10,pos-1) or num *= 10;
		num *= Math.pow(10,pos-1); 
		//12.9를 소수점 첫번째 자리에서 반올림
		num = Math.round(num);
		//or num /= 10;
		num /= Math.pow(10, pos-1);
		//1.29를 소수점 두번째 자리에서 반올림
		System.out.println(num);
	}

}
