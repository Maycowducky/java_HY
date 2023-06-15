package day12.practice;

public class VocabularyNoteEx {

	public static void main(String[] args) {
		/* 영어 단어장을 만들기 위해 필요한 객체를 만들고 테스트 해보세요.
		 * 
		 */
		Word word1 = new Word("Vocabulary", "the words that make up a language");
		word1.print();
		word1.addMeaning("all of the words known and used by a person");
		word1.print();
		word1.removeMeaning(1);
		word1.print();
	}

}
/* 한 단어를 관리하는 클래스
 * → 단어
 * → 뜻
 * */
/*class Word{
	//멤버 변수
	private String title;
	private String meaning[];
	private int meaningCount;
	//생성자
	public Word(String title, String meaning) {
		this.title = title;
		this.meaning = new String[5]; //기본 5개
		this.meaning[0] = meaning;
		meaningCount++;
	}
	public Word(String title) {
		this.title = title;
		this.meaning = new String[5]; //기본 5개
		
	}
	//메서드
	/**단어와 뜻을 출력하는 메서드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 → void
	 * 메서드명 : print
	 */
	/*public void print() {
		System.out.println("Word: " + title);
		System.out.println("Meaning: ");
		for(int i = 0; i < meaningCount; i++) {
				System.out.println(i + 1 + ". " + meaning[i]);
		}
	}
	/** 뜻을 추가하는 메서드
	 * 매개변수 : 추가될 뜻 → String meaning
	 * 리턴타입 : 없음 → void
	 * 메서드명 : addMeaning
	 */
	/*public void addMeaning(String meaning) {
		//뜻이 다 찼으면 다 찼다고 출력하고 종료
		if(meaningCount == this.meaning.length) {
			System.out.println("It's all filled.");
			return;
		}
		this.meaning[meaningCount++] = meaning;
		
	}
	/** 뜻을 제거하는 메서드
	 * 매개변수 : 제거할 뜻의 번호 → int num
	 * 리턴타입 : 없음 → void
	 * 메서드명 : removeMeaning
	 */
	/*public void removeMeaning(int num) {
		if(num > meaningCount || num < 1) {
			System.out.println("Doesn't work.");
			return;
		}
		//num-1번지부터 하나씩 당겨와서 채움(덮어쓰기함)
		for(int i = num - 1; i < meaningCount - 1; i++) {
			meaning[i] = meaning[i+1];
		}
		//마지막에 쓸모 없는 데이터를 지움
		meaning[meaningCount-1] = null;
		//제거 됐으면 뜻 개수를 하나 줄임
		meaningCount--;
	}
}
*/









