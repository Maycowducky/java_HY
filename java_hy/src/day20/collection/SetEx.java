package day20.collection;

import java.util.HashSet;

public class SetEx {

	public static void main(String[] args) {
		//set 순서대로 적어도 순서를 보장하지 않음
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println(set);
		set.remove(10);
		System.out.println(set);
		System.out.println(set.contains(20));
		System.out.println(set.size());
		
	}

}
