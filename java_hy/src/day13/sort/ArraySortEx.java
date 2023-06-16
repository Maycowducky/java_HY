package day13.sort;

import java.util.Arrays;
import java.util.Comparator;

import array.Array;

public class ArraySortEx {

	public static void main(String[] args) {
		//버블 정렬 예제
		int arr[] = {1, 4, 7, 9, 2, 8, 3, 6};
		
		//arr.length-1 한번이라도 일을 덜 하기 위해서
		for(int i = 0; i < arr.length - 1; i++) { 
			// - i 추가하는이유 
			//처음에는 전체를 비교, 끝에 번호가 정해지면 그것을 비교 안함
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = tmp;
				}
			}
			Array.printArray(arr);
		}
		//integer는 class 이기때문에 정수부터 null까지 가능
		//정수가 integer로 되어있다면 Arrays.sort 활용
		Integer arr2[] = {1, 4, 7, 9, 2, 8, 3, 6};
		//Arrays.sort(arr2);
		//내림차순 Comparator.reverseOrder() 사용
		Arrays.sort(arr2, Comparator.reverseOrder());
		for(Integer tmp : arr2) {
			System.out.print(tmp + " ");
		}
	}

}
