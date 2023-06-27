package day20.generic;

//제네릭 extends 클래스
public class Student<T extends Number> { 

//public class Student<T> { 
//여러개가 올경우 <T, K> comma를 이용해서 추가
	
	int grade, classNum, num;
	String name;
	public T kor, math, eng;
}
