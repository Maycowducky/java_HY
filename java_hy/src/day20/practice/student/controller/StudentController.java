package day20.practice.student.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import day20.practice.student.vo.Student;
import lombok.Data;

@Data
public class StudentController implements Program {
	
	private final static int EXIT = 4;
	private Scanner sc = new Scanner(System.in);
	
	private ArrayList <Student> list = new ArrayList<>();
	
	@Override
	public void run() {
		System.out.println("프로그램 시작!");
		
		int menu;
		
		do {
			try {
			System.out.println(list);
			printMenu();
			menu = sc.nextInt();
			
			runMenu(menu);
			}catch(InputMismatchException e) {
				menu = EXIT-1;//종료 메뉴가 아닌 아무 메뉴를 추가
				sc.nextLine();//앞에서 잘못 입력한 내용을 비워줌
				System.out.println("잘못된 입력");
			}
			}while (menu != EXIT); 
	}
	@Override
	public void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 삭제");
		System.out.println("3. 학생 수정");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 선택: ");
	}
	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertStudent();
			break;
		case 2:
			deleteStudent();
			break;
		case 3:
			updateStudent();
			break;
		case 4:
			break;
		default:
		}
		System.out.println("프로그램 실행!");
	
	}
	private void deleteStudent() {
		//삭제할 학생 정보를 입력 (학년, 반, 번호)
		System.out.print("grade : ");
		int grade = sc.nextInt();
		System.out.print("class : ");
		int classNum = sc.nextInt();
		System.out.print("number : ");
		int number = sc.nextInt();
		//삭제할 학생정보를 이용하여 학생 객체를 생성
		Student tmp = new Student(grade, classNum, number, null);
		
		//삭제를 시도해서 성공하면 성공했다고, 실패하면 실패했다고 알려줌
		if(list.remove(tmp)) {
			//삭제 성공
			System.out.println("삭제 성공");
			return;
		}
		System.out.println("삭제 실패");
	}
	private void updateStudent() {
		//수정할 학생의 정보를 입력(학년, 반, 번호)
		System.out.print("grade : ");
		int grade = sc.nextInt();
		System.out.print("class : ");
		int classNum = sc.nextInt();
		System.out.print("number : ");
		int number = sc.nextInt();
		//학생 개체
		Student tmp = new Student(grade, classNum, number, null);
		int index = list.indexOf(tmp);
		//없으면 종료
		if(index == -1) {
			System.out.println("수정 실패");
			return;
		}
		//수정할 학생이 있는지 없는지 확인
		System.out.print("grade : ");
		grade = sc.nextInt();
		System.out.print("class : ");
		classNum = sc.nextInt();
		System.out.print("number : ");
		number = sc.nextInt();
		System.out.print("name : ");
		sc.nextLine(); //number를 입력하고 난 뒤 엔터를 처리하기 위해
		String name = sc.nextLine();
			//학생 정보를 수정
			//수정될 학생 정보가 이미 있는 학생인지 확인
		//수정될 정보를 이용하여 학생 객체를 생성
			tmp = new Student(grade, classNum, number, name);
			//학년,반,번호가 일치하는 학생이 있는지 확인 있으면 종료
			if(list.contains(tmp)) {
				System.out.println("수정 실패");
				return;
		}
			list.get(index).update(grade, classNum, number, name);
	}
	private void insertStudent() {
		//추가할 삭생의 정보 입력(학력, 반, 번호, 이름)
		System.out.print("grade : ");
		int grade = sc.nextInt();
		System.out.print("class : ");
		int classNum = sc.nextInt();
		System.out.print("number : ");
		int number = sc.nextInt();
		System.out.print("name : ");
		sc.nextLine(); //number를 입력하고 난 뒤 엔터를 처리하기 위해
		String name = sc.nextLine();
		
		//입력 받을 정보를 이용하여 학생 객체를 생성
		Student std = new Student(grade, classNum, number, name);
		
		//학생 리스트에 추가
		//학생이 있는지 없는지 확인(학력, 반, 번호)해서 없으면 추가
		if(!list.contains(std)) {
			list.add(std);
			System.out.println("성공했습니다");
			return;
		}
		
		//추가 성공하면 추가 했다고, 실패하면 실패했다고 콘솔창에 출력
			System.out.println("실패했습니다");
	}
	
}
	
		

	