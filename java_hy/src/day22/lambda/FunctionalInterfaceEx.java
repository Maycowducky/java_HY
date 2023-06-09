package day22.lambda;

import java.util.function.Consumer;

import lombok.AllArgsConstructor;
import lombok.Data;

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		//매개변수 1개 이기때문에 아래와 같이 가능
		Consumer<String> consumer = s -> System.out.println(s);
		//원래는 이렇게 써야함
		//Consumer<String> consumer = (s) -> {
		//System.out.println(s);
		//};
		consumer.accept("Hong");
		Consumer<Student> consumer2 = s -> System.out.println(s.getName());
		Student std = new Student(1, 1, 1, "Hong");
		consumer2.accept(std);
		//기존 방식 학생정보 전체 출력
		printStudent(std);
		printStudent(std, s->System.out.println(s));
		//람다식 학생 이름만 출력
		printStudentName(std);
		printStudent(std, s-> System.out.println(s.getName()));
		
		printStudent(std, s ->{
			System.out.println("grade  :" + s.getGrade());
			System.out.println("class  :" + s.getClassNum());
			System.out.println("number :" + s.getNum());
		});
	}
	//학생 전체 정보 출력
	public static void printStudent(Student std) {
		System.out.println(std);
	}
	//학생 이름 출력
	public static void printStudentName(Student std) {
		System.out.println(std.getName());
	}
	//람다식을 이용하면
	public static void printStudent(Student std, Consumer<Student> consumer) {
		consumer.accept(std);
	}
}
@Data
@AllArgsConstructor
class Student{
	int grade, classNum, num;
	String name;
}