package day19.format;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		int price = 10000; //10,000
		//빈자리에 아무것도 채우지 않음/ 정수 3자리마다 ',' 추가
		DecimalFormat df = new DecimalFormat("\u00A4###,###");
		//\u00A4는 맨앞에 ?를 출력 
		String str1 = df.format(price);
		System.out.println(str1);
							//빈자리 마다 0을 채움
		df = new DecimalFormat("000,000"); 
		String str2 = df.format(price);
		System.out.println(str2);
	}

}
