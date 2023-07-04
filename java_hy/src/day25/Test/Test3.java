package day25.Test;

import java.util.ArrayList;
import java.util.List;


public class Test3 {

	public static void main(String[] args) {
		//HashSet은 List의 구현 클래스가 아니기 때문에 
		//HashSet의 객체를 List가 관리할수 없기때문에 ArrayList로 바꿈
		List<Integer> list = new ArrayList<>();
		//3은 int. 3이 자동으로 박싱되서 Integer의 객체로 저장
		list.add(3);
		list.add((int)4);
		//5를 박싱으로 Integer의 객체로 변환 후 저장
		list.add((Integer)5);
		System.out.println(list);
	}
}