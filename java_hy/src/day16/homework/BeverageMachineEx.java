package day16.homework;

import java.util.Scanner;

public class BeverageMachineEx {
		/* 음료수를 뽑는 자판기 프로그램을 작성하세요.
		 * 단, 음료수 자판기에 음료수는 사이다, 콜라, 환타가 고정이라고 가정.
		 * 메뉴를 선택하면 음료수와 잔액을 출력.
		 * 메뉴
		 * 1. 금액 투입
		 * 2. 메뉴 선택
		 * 3. 제품 입고
		 * 4. 프로그램 종료
		 * 메뉴 선택 : 2
		 * 1. 사이다
		 * 2. 콜라
		 * 3. 환타
		 * 음료 선택 : 1
		 * 사이다를 선택 했습니다.
		 * 사이다가 나옵니다. [금액이 충분한 경우]
		 * 잔돈 얼마가 나옵니다.
		 * 금액이 부족합니다. [금액이 부족한 경우]
		 * 잔돈 얼마가 나옵니다.
		 */
		private static int cash;
		private static int spriteStock, cokeStock, fantaStock;
		
		public static void main(String[] args) {
			cash = 30000;
			spriteStock = 15;
			cokeStock = 15;
			fantaStock = 15;
			
			Scanner sc = new Scanner(System.in);
			int choice;
			do {
				printMenu();
				System.out.print("상품 선택: ");
				choice = sc.nextInt();
				
				switch(choice) {
				case 1:
					insertCash(sc);
					break;
				case 2:
					selectMenu(sc);
					break;
				case 3:
					stock();
					break;
				case 4:
					System.out.println("프로그램 종료!");
					break;
				default:
					System.out.println("잘못된 선택. 다시 시도해주세요.");
				}
			}while (choice != 4);
			sc.close();

		} 
		private static void stock() {
		
		}
		private static void printMenu() {
			System.out.println("======메  뉴======");
			System.out.println("1. 금액 투입");
			System.out.println("2. 메뉴 선택");
			System.out.println("3. 제품 입고");
			System.out.println("4. 프로그램 종료");
			System.out.println("=================");
			
		}
		private static void insertCash(Scanner sc) {
			System.out.print("금액 입력: ");
			int amount = sc.nextInt();
			
			if(amount < 0) {
				cash += amount;
				System.out.println(amount + "won");
				System.out.println(cash + "won 남았습니다.");
			}else {
				System.out.println("잔액이 부족합니다. 다시 시도해주세요.");
			}
		}
		private static void selectMenu(Scanner sc) {
			if(cash <= 0) {
				System.out.println("잔액이 부족합니다. 동전을 투입해주세요.");
				return;
			}
			System.out.println("===========메뉴============");
			System.out.println("1. 스프라이트(1200won)");
			System.out.println("2. 코카콜라(1300won)");
			System.out.println("3. 환타(1000won)");
			System.out.println("==========================");
			
			System.out.print("메뉴 선택: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				dispenseBeverage("스프라이트", 1200, spriteStock);
				break;
			case 2:
				dispenseBeverage("코카콜라", 1300, cokeStock);
				break;
			case 3:
				dispenseBeverage("환타", 1000, fantaStock);
				break;
			default:
				System.out.println("없는 번호 입니다. 다른 번호 선택해주세요.");
			}
			
		}
		private static void dispenseBeverage(String string, int i, int cokeStock2) {
			
		}
	}

