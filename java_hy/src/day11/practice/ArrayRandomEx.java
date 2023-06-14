package day11.practice;


public class ArrayRandomEx {

	public static void main(String[] args) {
		/* 1 - 9 사이의 랜덤한 수를 3개 만들어서 배열에 저장한 후 출력하는 코드를 작성하세요.*/
		int min = 1, max = 9;
		int [] arr = new int[3];
		
		/* 예전 예제의 경우 아래와 같이
		arr[0] = (int)(Math.random()*(max - min + 1) + min);
		arr[1] = (int)(Math.random()*(max - min + 1) + min);
		arr[2] = (int)(Math.random()*(max - min + 1) + min);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		 */
		
		for(int i = 0 ; i < 3; i++) {
			arr[1] = (int)(Math.random()*(max - min + 1) + min);
			System.out.println(arr[1]);
			
		}
	}
}
