package day18.practice;

public class StringIndexOfEx {

	public static void main(String[] args) {
		//Hello World에서 l이 몇개
		//indexOf
		
		String str = "Hello World";
		int count = 0;
		String search ="l";
		int index = -1;
		
		while ((index = str.indexOf('l', index + 1)) != -1) {
			count++;
		}
		System.out.println(str + "에서 0번지부터 " + "l" + "가 몇개 있나요? " + count);
		
		//강사님 예:)
		System.out.println("===========강사님 예:)===========");
		/*String str = "Hello World";
		 *int count = 0;
		 *String search ="l";
		 *int index = -1;
		 * 
		 */
		//반복 : 찾으면 반복
		do {
			//Hello World에 l의 위치를 찾음 => lo world에서 l의 위치를 찾음 → o world에서 l의 위치를 찾음
			//→d에서 l의 위치를 찾음
			index = str.indexOf(search, ++index);
			//찾았으면 개수를 증가
			if(index != -1) {
				count++;
			}
		}while(index != -1);
		//개수 출력
		System.out.println(str + " : " + search + " : " + count);
	}
	
}
