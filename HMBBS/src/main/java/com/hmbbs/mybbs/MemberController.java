package com.hmbbs.mybbs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  //컨트롤러 어노테이션 필수.
public class MemberController {

	
	@GetMapping(value = "/SignUpForm")
	public String SignUpForm() throws Exception{
		return "member/SignUpform";
	}
	
}
