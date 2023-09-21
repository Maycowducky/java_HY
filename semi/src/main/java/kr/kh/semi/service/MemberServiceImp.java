package kr.kh.semi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.semi.mapper.MemberMapper;
import kr.kh.semi.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService {

	@Autowired
	public MemberMapper memberMapper;
	
	@Override
	public void memberJoin(MemberVO member) throws Exception{
		member = new MemberVO();
		
		memberMapper.memberJoin(member);
	}

	@Override
	public int idCheck(String memberId) {
		int result = memberMapper.idCheck(memberId);
		return result;
	}
}
