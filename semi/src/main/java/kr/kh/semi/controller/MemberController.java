package kr.kh.semi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.kh.semi.service.MemberService;
import kr.kh.semi.vo.MemberVO;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/joinForm")
	public void joinForm() {
		logger.info("회원가입 페이지 진입");
	}
	
	@PostMapping("/joinPro")
	public String join(MemberVO member, Model model) throws Exception{
		
		logger.info("post회원가입 진입");
		System.out.println(member);
		boolean chk = memberService.memberJoin(member);
		logger.info("회원가입 성공");
		
		model.addAttribute("chk", chk);
		
		return "/member/joinPro";
	}
	
	@GetMapping("/idCheck")
	@ResponseBody
	public String idcheck(String memberId) {
		String chk ="";
		int result = 0;
		result = memberService.idCheck(memberId);
		if(result == 1) {
			chk = "redundancy";
		} else if (result == 0) {
			chk = "noredundancy";
		}
		return chk;
	}

}
