package kr.kh.semi.service;

import kr.kh.semi.vo.MemberVO;

public interface MemberService {

	public void memberJoin(MemberVO member) throws Exception;

	public int idCheck(String memberId);
}
