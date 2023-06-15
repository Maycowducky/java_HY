package day11.homework;

import array.Array;
import java.util.*;

public class BaseballGameEx {

	public static void main(String[] args) {
		/* 규칙 :
		 * B : 같은 숫자가 있지만 위치가 다름
		 * S : 같은 숫자가 있고 위차가 같음
		 * 30 : 일치하는 숫자가 하나도 없음
		 *
		 * 예:
		 * 랜덤숫자 : 1 9 5
		 * 사용자 : 1 2 3
		 * 1S
		 * 사용자 : 4 5 6
		 * 1B
		 * 사용자 : 1 2 9
		 * 1S1B
		 * 사용자 : 2 3 4
		 * 30
		 * 사용자 : 1 9 5
		 * 35
		 * Good!
		 */
		
		// 숫자 야구 게임을 구현하세요.
		// 1 ~ 9 사이의 중복되지 않은 세 수를 맞추는 게임.
		int com[] = new int[3]; //랜덤으로 생성 된 수를 저장할 배열
		int user[] = new int [3]; // 사용자가 입력한 수를 저장할 배열
		int min = 1, max = 9;
		int strike = 0; //스트라이크 개수
		int ball = 0; //볼의 개수
		Scanner sc = new Scanner(System.in);
		// 맞춰야할 숫자 3개를 랜덤으로 생성 (중복 X)
		Array.createRandomArray(min, max, com);
		Array.printArray(com); //나중에 주석 처리
		// 반복문
		do {
			
			// 사용자가 숫자 3개를 입력
		System.out.println("user : ");
		for(int i = 0; i < user.length; i++) {
			user[i] = sc.nextInt();
		}
		//사용자 입력 체크
		
		//판별 
		strike = 0;
		ball = 0;
		//스트라이크 개수 판별
		strike = strike(com, user);
		System.out.println(strike);
		//볼의 개수 판별
		
		//스트라이크와 볼의 개수에 맞게 출력
		
		
		}while(strike < 3);
		
	}
	
	/** 스트라이크 개수를 판별하는 메서드
	 * → 두 배열에서 같은 번지에 있는 값들이 몇개 같은지 알려주는 메서드
	 * 매겨변수 : 두 배열 → int arr1[], int arr2[]
	 * 리턴타입 : 같은 번지에 있는 값들이 몇개 같은지 → 몇개 → 정수 → int
	 * 메서드명 : strike
	 * */
	public static int strike(int arr1[], int arr2[]) {
		//배열 생성이 안된 배열이 1라도 있으면 비교할 수 없어서 0을 리턴
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		//배열의 개수가 다른 경우 작은 크기의 배열을 기준으로 배교하기 위해 size 계산
		int size = arr1.length < arr2.length ? arr1.length : arr2.length;
		int count = 0; //스트라이크 개수
		for(int i = 0; i < size; i++) {
			//같은 번지에 있는 값들이 서로 같으면 (스트라이크 이면)
			if(arr1[i] == arr2[i]) {
				count++;
			}
		}
		return count;
	}
}
