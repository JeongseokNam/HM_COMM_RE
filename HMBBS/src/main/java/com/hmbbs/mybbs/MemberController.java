package com.hmbbs.mybbs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hmbbs.VO.MemberVO;
import com.hmbbs.service.MemberService;

@Controller
public class MemberController {

	@Inject MemberService memberService;
	
	@GetMapping(value = "/SignUpForm")
	public String SignUpForm() throws Exception{
		return "member/SignUpform";
	}
	
	
	@PostMapping(value = "/signUp")
	public String SignUp(MemberVO memberVO) throws Exception{
		memberService.signUp(memberVO);
		return "member/SignInform";
	}
}
