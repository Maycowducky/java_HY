package day13.practice;

import lombok.Data;

@Data
public class Subject {

		// 멤버 변수
		private String title; // 과목명 : 국어, 영어, 수학
		private double total; // 과목의 총점 = 중간 + 기말 + 수행평가
		private double midTerm;
		private double finalExam;
		private double performance;
		private int grade;
		private int semester;
		
		// 생성자
		public Subject(String title) {
			this.title = title;
			this.grade = 1;
			this.semester = 1;
		}
		public Subject(String title, int grade, int semester) {
			this.title = title;
			this.grade = grade;
			this.semester = semester;
		}
		
		//메서드
		/** 중간고사 성적 추가/수정 : setMidTerm */
		
		/** 기말고사 성적 추가/수정 : setFinalExam*/
		
		/** 수행평가 성적 추가/수정 : setPerformance*/
		
		/** 전체 성적 추가/수정 */
		public void updateScore(int midTerm, int finalExam, int performance) {
			this.midTerm = midTerm;
			this.finalExam = finalExam;
			this.performance = performance;
			total = midTerm + finalExam + performance;
		}
		/** 성적 출력		 */
		public void print() {
			System.out.println("title  : " + title);
			System.out.println("grade  : " + grade);
			System.out.println("sem    : " + semester);
			System.out.println("mid    : " + midTerm);
			System.out.println("final  : " + finalExam);
			System.out.println("perfor : " + performance);
			System.out.println("total  : " + total);
		}
}