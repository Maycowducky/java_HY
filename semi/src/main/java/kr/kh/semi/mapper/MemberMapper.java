package kr.kh.semi.mapper;

import kr.kh.semi.vo.MemberVO;

public interface MemberMapper {

	public void memberJoin(MemberVO member);

	public int idCheck(String memberId);

	public MemberVO selectMember(String user_id);

	public boolean insertMember(MemberVO member);
}
