package kr.kh.semi.service;

import kr.kh.semi.vo.MemberVO;

public interface MemberService {

	public boolean memberJoin(MemberVO member) throws Exception;

	public int idCheck(String memberId);

	public MemberVO login(MemberVO member);


}
