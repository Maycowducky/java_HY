package day21.practice.updown.vo;

import lombok.Data;

@Data
public class RecordGame {
	//아이디와 플레이횟수 관리
	private String id;
	private int count;
	//생성자
	public RecordGame(String id, int count) {
		this.id = id;
		this.count = count;
	}
	//이쁘게보기 좋게 출력하기 위한 코드
	@Override
	public String toString() {
		return "[" + id + " : " + count + "]";
	}
}

