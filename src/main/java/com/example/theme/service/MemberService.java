package com.example.theme.service;

import org.springframework.stereotype.Service;

import com.example.theme.dao.MemberDao;
import com.example.theme.dto.User;

@Service
public class MemberService {

	private MemberDao memberDao;
	
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public User getUser(String id, String pw) {
		return memberDao.getUser(id, pw);
	}

	public void join(String id, String pw, String name) {
		memberDao.join(id, pw, name);
	}

}
