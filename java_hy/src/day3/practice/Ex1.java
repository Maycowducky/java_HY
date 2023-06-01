package day3.practice;

public class Ex1 {

	public static void main(String[] args) {
		/*성적을 입력 받아 입력받은 성적이 60점이상인지 확인하는 코드를 작성하세요
		 * 예:
		 * input score:
		 * 65
		 * Did you pass 65 points? true
		 * input score:
		 * 45
		 * Did you pass 45 points? false
		 */
		
		int score = 65;
		String str;
		str = score >= 60 ? "true" : "false";
		System.out.println("Do you pass 65 points? " + str);
		int score2 = 45;
		String str2;
		str2 = score2 >= 60 ? "true" : "false";
		System.out.println("Do you pass 45 points? " + str2);
		
		//올바른 사용법****
		//Scanner sc= new Scanner(System.in);
		//System.out.println("input score : ");
		//int score = sc.nextInt();
		//boolean result = score >= 60;
		//System.out.println("Do you pass "+ score +" points? " + result);
		//sc.close();
		
		
	}

}
