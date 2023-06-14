package day11.practice;


public class ArrayRandomEx2 {

	public static void main(String[] args) {
		/* 1 - 9 사이의 랜덤한 수를 3개 중복되지 않게
		 만들어서 배열에 저장한 후 출력하는 코드를 작성하세요.*/
		int min = 1, max = 9;
		int [] arr = new int[3];
		
		//방법 1: 9번지까지 있는 배열을 이용
		boolean checkArr[] = new boolean[10];
		
		for(int i = 0; i < 3; ) {
			int random = (int)(Math.random()*(max - min + 1) + min);
			//checkArr 배열에 random번지에 있는 값이 false 이면 
				if(!checkArr[random]) {
				//if(checkArr[random]==false){ 도 가능
				// random을 배열에 저장. 
				arr[i] = random;
				// i를 증가.
				i++;
				// checkArr 배열에 random 번지에 있는 값을 true로 변경
				checkArr[random] = true;
			}
		}
		for(int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}	
	}
}
