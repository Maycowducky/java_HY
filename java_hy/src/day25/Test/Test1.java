package day25.Test;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<>();
		list.add(new Point(1,2));
		//정수형 변수 x,y가 선언되지 않아서 선언함.
		int x = 1, y = 2;
		list.add(new Point(x,y));
		list.add(new Point(3,4));
		
	}

}
//public class 를 붙이면 에러가 뜨기 때문에 public 을 제거함
class Point{
	int x, y;
	 public Point(int x, int y) {
		//x,y 에 this. 이 안붙어서 this.을 붙임
		this.x = x;
		this.y = y;
	}
}