package day18.practice;

public class RegexClassNote {

	public static void main(String[] args) {
		/* 입력받은 문자열이 http:// 또는 https://
		 * 시작하는지 확인하는 정규표현식을 작성해보세요
		 */
	} 
	/* 정규 표현식
	 * 메타문자
	 * 특정한 규칙을 가진 문자열의 집합을 표현하는데 사용하는 언어 
	 * \d : 숫자 
	 * \s : 공백 
	 * & 탭 
	 * \w : 영문 + 숫자 
	 * [문자들] : 해당 문자들만 허용
	 *  	[a-zA-Z0-9] : \w와 같음
	 *  	[가-힣] : 모든 한글 
	 *  + : 1이상 무한대 이하 
	 *  	[a-z]+ : 소문자가 1개이상 무한대 
	 * ? : 0 또는 1개 
	 * * : 0개 이상 
	 * ^ 
	 * 		문장 처음에 위치 
	 * 		중간에 위치 : Not
	 * $ : 문장의 가장 끝 
	 * {min,max} : 반복 횟수 
	 * 		[a-z]{1,3} : 소문자가 1개이상 3개이하 
	 * () : 하나의 패턴 구분자 안에 서브 패턴을 지정해서 사용할 경우
	 */
	
	//함수
	/* 1. search() : 검색된 문자열의 위치를 리턴
	 * 2. replace() : 문자열의 일부를 다른 문자열로 변경
	 * 3. test() : 찾는 문자열이 있는지 확인
	 */
	
	//실습 https://regex101.com/ → 왼쪽 ≡ → Java 8 → 선택 후 입력
	/* 전화번호
	 * 아이디
	 * 		알파벳 + 숫자
	 * 		첫글자 알파뱃
	 * 		5글자이상 10글자 이하
	 * 비밀번호
	 * 		알파벳 1개이상, 숫자 1개이상
	 * 		8글자 이상, 20글자 이하
	 */
	
	//참고 문언
	//https://namu.wiki/w/%EC%A0%95%EA%B7%9C%ED%91%9C%ED%98%84%EC%8B%9D
	//https://www.w3schools.com/js/js_regexp.asp
}
/* ^https?://$
	http://
	https://
 */

  /* ^https?://[a-zA-Z\.]+$
	*http://www.naver.com
	*https://www.daum.net
	*/