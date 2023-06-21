package day16.homework;

import java.util.Scanner;

public class BeverageMachineEx {
		/* 음료수를 뽑는 자판기 프로그램을 작성하세요.
		 * 단, 음료수 자판기에 음료수는 사이다, 콜라, 환타가 고정이라고 가정.
		 * 메뉴를 선택하면 음료수와 잔액을 출력.
		 * 
		 * 1. 금액 투입
		 * 2. 메뉴 선택
		 * 3. 제품 입고
		 * 4. 프로그램 종료
		 */
		private static int cash;
		private static int cokeStock;
		private static int spriteStock;
		private static int fantaStock;
		
		public static void main(String[] args) {
			cash = 0;
			cokeStock = 5;
			spriteStock = 5;
			fantaStock = 5;
			
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
		private static void selectMenu(Scanner sc) {
			
		}
		private static void printMenu() {
			System.out.println("======Vending Machine=====");
			System.out.println("1. 금액 투입");
			System.out.println("2. 메뉴 선택");
			System.out.println("3. 제품 입고");
			System.out.println("4. 프로그램 종료");
			System.out.println("==========================");
		}
		private static void insertCash(Scanner sc) {
			System.out.print("금액 입력: ");
			int amount = sc.nextInt();
			
			if(amount < 0) {
				cash += amount;
				
			}
		}
	}

