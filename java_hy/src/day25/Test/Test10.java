package day25.Test;

public class Test10 {

	public static void main(String[] args) {
		PhoneNumber pn1 = new PhoneNumber("Hong", "010-1234-1111");
		PhoneNumber pn2 = new PhoneNumber("Lim", "010-1111-1234");
	}

}
class PhoneNumber{
	private String name, number;
	
	public PhoneNumber(String name, String number) {
		this.name = name;
		this.number = number;
	}
	public String toString(String str) {
		str = "이름 : " + name + ",번호 : " + number;
		return str;
	}
}