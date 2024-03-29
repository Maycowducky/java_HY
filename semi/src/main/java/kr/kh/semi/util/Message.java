package kr.kh.semi.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
	private String url, msg;
	
	public String toString() {
		return "{ " + "msg : '" + msg + "', url : '" + url + "' }";
	}
}
