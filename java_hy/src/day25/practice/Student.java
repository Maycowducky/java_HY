package day25.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
	
public class Student {
	private String studentId;
	private String classNum;
	private String name;
	
	public static void main(String[] args) {
		//대학생 관리 프로그램 작성
		final int EXIT = 3;
		Map<String, Student> studentMap= new HashMap<>(); 
		Scanner sc = new Scanner(System.in);
		
		boolean menu = true;
		while(menu) {
			System.out.println("메뉴");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 확인");
			System.out.println("3. 종료");
			System.out.print("메뉴선택: ");
			int choice = sc.nextInt();
				switch(choice) {
				case 1:
					registerStudent(studentMap, sc);
					break;
				case 2:
					checkStudent(studentMap);
					break;
				case 3:
					menu = false;
					break;
				
				default:
					System.out.println("잘못된 선택 입니다.");
				}
			
			}
		System.out.println("프로그램 종료");
		System.out.println();
	}

	private static void checkStudent(Map<String, Student> studentMap) {
		System.out.println("학생 확인 메뉴");
		if(studentMap.isEmpty()) {
			System.out.println("등록된 정보가 없습니다.");
		}else {
			for(Student student : studentMap.values()) {
				System.out.println("학번: " + student.getStudentId());
				System.out.println("전공: " + student.getClassNum());
				System.out.println("이름: " + student.getName());
				System.out.println();
			}
			
		}
	}

	private static void registerStudent(Map<String, Student> studentMap, Scanner sc) {
			System.out.println("학생 등록 메뉴");
			System.out.println("학번: ");
		String studentId = sc.next();
			System.out.println("전공: ");
			sc.nextLine();
		String classNum = sc.nextLine();
			System.out.println("이름: ");
		String name = sc.nextLine();
		
		Student student = new Student(studentId, classNum, name);
		studentMap.put(studentId, student);
			System.out.println("학생 등록되었습니다.");
	}
	
	public Student(String studentId, String classNum, String name) {
		this.studentId = studentId;
		this.classNum = classNum;
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public String getClassNum() {
		return classNum;
	}
	public String getName() {
		return name;
	}
}
