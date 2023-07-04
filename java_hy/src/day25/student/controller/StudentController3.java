package day25.student.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day23.homework.phone.vo.PhoneBook;
import day25.student.vo.Student;

public class StudentController3 {

	private Scanner sc = new Scanner(System.in);
	private List<Student> list= new ArrayList<Student>();
	
	public void run() {
		int menu;
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택(메뉴를 입력받음): Scanner 필요
			menu = sc.nextInt();
			//선택된 메뉴에 따른 기능을 실행
			runMenu(menu);
		}while(menu != 3);
		sc.close();
	}
	private void printMenu() {
		//메뉴 출력
		System.out.println("메뉴");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 확인");
		System.out.println("3. 학생 등록");
		System.out.print("메뉴 선택: ");
	}
	private void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertStudent();
			break;
		case 2:
			//학생 전체를 확인
			print();
			break;
		case 3:
			break;
		default:
		}
	}
	public void insertStudent() {
		String num, name, major;
		Student tmp;
		//학생정보 입력
		//학번(문자열, 공백이 없는)
		System.out.println("학번: ");
		num = sc.next();
		//이름(문자열, 공백이 있는)
		System.out.println("이름: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.println("전공: ");
		//과(문자열,공백이 있는)
		major = sc.nextLine();
		//학생정보 리스트에 저장
		//입력한 정보를 이용하여 학생 객체를 생성
		tmp = new Student(num, name, major);
		//리스트에 학생 객체를 추가
		list.add(tmp);
	}
	public void print() {
		for(Student tmp2 : list) {
			System.out.println(tmp2);
		}
	}
	@Override
	public void load() {
		try(FileInputStream fis = new FileInputStream("phone_book.txt");
			ObjectInputStream ois = new ObjectInputStream(fis)){

			pb = (PhoneBook)ois.readObject();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	@Override
	public void save() {
		try(FileOutputStream fos = new FileOutputStream("phone_book.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(pb);
		} catch (IOException e) {
			e.printStackTrace();
			}
		}
		
	}
