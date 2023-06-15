package day12.homework;

public class LottoEx {

	public static void main(String[] args) {
		/* 로또 번호를 생성하고, 사용자가 번호를 입력하면 몇등인지 출력하는 코드를 작성하세요.
		 * 
		 * 1등 : 번호 6개
		 * 2등 : 번호 5개 + 보너스
		 * 3등 : 번호 5개
		 * 4등 : 번호 4개
		 * 5등 : 번호 3개
		 * 
		 * number : [1, 3, 40, 23, 24, 45]
		 * bonus  : 2
		 * user   : 1 2 3 4 5 6
		 * losing ticket!
		 */
		
		int[] lotto = new int[6];
		Random random = new Random();
		
		// 랜덤번호 생성
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1; 
			// 중복번호 제거
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				} 
			}
		} 
		
		// 오름차순 정렬
		for(int i = 0; i < lotto.length; i++) {
			for(int j = i + 1; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				} 
			} 
		} 
		
		// 랜덤번호 출력
		System.out.println("* 로또번호 : " + Arrays.toString(lotto));
		
	} // main
	
} // class
