package day22.practice.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

import day22.practice.vo.Student;

public class StudentManager3 implements Program {
	
	private List<Student> list = Arrays.asList(
			new Student(1, 1, 1, "Hong"),
			new Student(1, 1, 2, "Ling"),
			new Student(2, 1, 1, "Park"),
			new Student(3, 1, 1, "Lee"),
			new Student(3, 3, 2, "Kim")
	);
	
	private Scanner sc = new Scanner(System.in);
	private final static int EXIT = 4;

	@Override
	public void run() {
		System.out.println("Program Start!!");
		int menu;
		do {
				printMenu();
				menu = sc.nextInt();
				runMenu(menu);
				
		}while(menu != EXIT);
		
	}

	@Override
	public void printMenu() {
		System.out.println("Menu");
		System.out.println("1. Student Info");
		System.out.println("2. Student Grade");
		System.out.println("3. Search Student");
		System.out.println("4. Exit");
		System.out.print("Select Menu : ");
	}

	@Override
	public void runMenu(int menu) {
	Stream<Student> stream = list.stream();
		switch(menu) {
		case 1:
			stream.forEach(std->System.out.println(std));
			break;
		case 2:
			//검색할 학년 입력
			System.out.print("grade: ");
			final int grade1 = sc.nextInt();
			stream
			.filter(std-> std.getGrade() == grade1)
			.forEach(std->System.out.println(std));
			break;
		case 3:
			//검색할 학년, 반, 번호를 입력
			System.out.print("grade: ");
			final int grade2 = sc.nextInt();
			System.out.print("class: ");
			final int classNum2 = sc.nextInt();
			System.out.print("Number: ");
			final int num2 = sc.nextInt();
			stream
			.filter(std -> std.equals(new Student(grade2, classNum2, num2, null)))
			.forEach(std->System.out.println(std));
			break;
		case 4:
			break;
		default:
		}
}
	private void print(Predicate<Student> p) {
		for(Student tmp : list) {
			if(p.test(tmp)) {
				System.out.println(tmp);
			}
		}
	}
}