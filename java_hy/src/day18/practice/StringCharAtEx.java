package day18.practice;

import java.util.Scanner;

public class StringCharAtEx {

	public static void main(String[] args) {
		//영문 소문자로 된 문자열을 입력받아 알파벳이 각각 몇개 있는지 확인하는 코드를 작성
		//input: hello world
		/* d : 1
		 * e : 1
		 * h : 1
		 * l : 3
		 * o : 2
		 * r : 1
		 * w : 1
		 */
		Scanner sc = new Scanner(System.in);
		int count[] = new int [26];
		String str = "hello world";
		System.out.print("input: ");
		String ch = sc.nextLine();
		
		
		for (int i = 0; i < str.length(); i++) {
			char c = Character.toLowerCase(str.charAt(i));
			if(Character.isLetter(c)){
				count [c -'a'] ++;
			}
		}
		for(char c = 'a'; c <= 'z'; c++) {
			int index = c - 'a';
			if(count[index] > 0) {
				System.out.println(c + ": " + count[index]);
			}
		}
		sc.close();
	}
}
