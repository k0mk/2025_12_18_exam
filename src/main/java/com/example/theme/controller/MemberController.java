package com.example.theme.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.theme.dto.User;
import com.example.theme.service.MemberService;
import com.example.theme.util.Util;

import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class MemberController {

	private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@GetMapping("/member/login")
	public String showlogin() {
		return "/member/login";
	}
	@GetMapping("/member/join")
	public String showjoin() {
		return "/member/join";
	}
//	@GetMapping("/member/profile")
//	public String showprofile(Model model) {
//		User user = memberService.getUsersprofile();
//		model.addAttribute(user);
//	}
	
	@GetMapping("/member/doJoin")
	@ResponseBody
	public String doJoin(String Id, String Pw, String name) {
		memberService.join(Id, Pw, name);
		return Util.replace("회원가입 성공", "/");
	}
	@GetMapping("/member/doLogin")
	@ResponseBody
	public String doLogin(String Id, String Pw) {
		User member = memberService.getUser(Id, Pw);
		if (member == null) {
			return Util.replace("로그인 실패", "/member/login");
		} else {
			return Util.replace("로그인 성공", "/");
		}
	}
}
