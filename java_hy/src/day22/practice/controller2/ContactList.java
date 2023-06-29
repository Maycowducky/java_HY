package day22.practice.controller2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import day22.practice.vo2.Phone;

public class ContactList implements Program{

	private List<Phone> list = Arrays.asList(
			new Phone("010-1234-5678", "Hong"),
			new Phone("010-4567-5678", "Ling"),
			new Phone("010-7890-5678", "Park"),
			new Phone("010-1111-5678", "Lee"),
			new Phone("010-1111-1234", "Kim")
			);
	private Scanner sc = new Scanner(System.in);
	private final static int EXIT = 4;
	
	@Override
	public void run() {
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
		System.out.println("1. Add Phone Number");
		System.out.println("2. Edit Phone Number");
		System.out.println("3. Search Phone Number");
		System.out.println("4. Program Exit");
		System.out.println("Select Menu: ");
	}

	@Override
	public void runMenu(int menu) {
		int num;
		switch(menu) {
		case 1:
			addContact();
			break;
		case 2:
			editContact(null);
			break;
		case 3:
			searchContact(null, null);
			break;
		case 4:
			break;
		default:
		}
	}

	private void searchContact(String num, String name) {
		for(Phone tmp : list) {
			if(tmp.equals(new Phone(num, " "))) {
				System.out.println(tmp);
			}
		}
	}

	private void editContact(String num) {
		for(Phone tmp : list) {
			if(tmp.getNum() == num) {
				System.out.println(tmp);
			}
		}
	}

	private void addContact() {
		for(Phone tmp: list) {
			System.out.println(tmp);
		}
	}



}

