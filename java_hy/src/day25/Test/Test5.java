package day25.Test;

import java.util.HashSet;
import java.util.Set;

public class Test5 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		//add, size는 Collection 인터페이스에 있는 메서드
		//Collection 인터페이스에 List와 Set
		set.add(1);
		set.add(2);
		for(int i = 0; i < set.size(); i++) {
			//get은 List에 있는 메서드 Set에는 없는 메서드
			//System.out.println(set.get(i));
		}
		for(Integer tmp : set) {
			System.out.println(tmp);
		}
	}

}
