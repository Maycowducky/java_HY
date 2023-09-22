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
	public boolean memberJoin(MemberVO member) throws Exception{
		
		memberMapper.memberJoin(member);
		return false;
	}

	@Override
	public int idCheck(String memberId) {
		int result = memberMapper.idCheck(memberId);
		return result;
	}

	@Override
	public MemberVO login(MemberVO member) {
		if(member == null) {
			return null;
		}
		MemberVO dbMember = memberMapper.selectMember(member.getUser_id());
		//가입된 아이디가 아니면
		if(dbMember == null) {
			return null;
		}
		return dbMember;
	
	}

	
	
}

	

