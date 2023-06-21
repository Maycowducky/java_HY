package day15.practice.shop.vo;

import lombok.Data;

@Data
public class Customer {

	//CID00001
	private String customerID; //고객이 추가되면 자동으로 발급
	private String name; // 고객명
	private String phoneNumber; //고객 전화번호
	
	//고객 ID 발급을 위한 클래스 변수
	//등록된 고객수
	private static int count; 
	//고객 ID 앞부분
	private final static String CID = "CID";
	//고객 ID 뒷부분 숫자의 최대 길이
	private final static int MAX_SIZE = 5;
	
	//생성자
	public Customer(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		generateCustomerID();//customerID 발급이 완료
		
	}
	/** 고객 ID 자동발급을 위한 메서드
	 * 
	 */
	private void generateCustomerID() {
		//1 → 00001 반복문으로 작업
		//1 → "1" 숫자열을 문자열로 생성
		String num = "" + ++count;//문자열 + 정수 → 문자열
		
		//"1".length == 1 문자열에 length를 추가하면 5개중에 4개를 뺀 값
		int length = num.length();
		for(int i = 0; i < MAX_SIZE - length; i++) {
			//A = A + B; A += B;
			num = "0" + num;
			
		}
		
		customerID = CID + num;
		
	}

	public void print() {
		System.out.println("고객번호: " + customerID);
		System.out.println("고객이름: " + name);
		System.out.println("전화번호: " + phoneNumber);
	}
	
}





