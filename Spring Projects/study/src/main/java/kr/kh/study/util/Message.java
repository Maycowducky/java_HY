package kr.kh.study.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class Message {
	private String url, msg;
	
	public String toString() {
		return "{ " + "msg : '" + msg + "', url : '" + url + "' }";
	}
}
