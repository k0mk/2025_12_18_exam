package com.example.theme.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.theme.dto.User;

@Mapper
public interface MemberDao {

	@Select("""
			SELECT * FROM member
				where loginId = #{id}
				AND loginPw = #{pw}
			""")
	public  User getUser(String id, String pw);

	@Insert("""
			INSERT INTO member
				SET loginId = #{id}
				,	loginPw = #{pw}
				,	name = #{name}
				,	regDate = NOW()
				,	updateDate = NOW()
			""")
	public void join(String id, String pw, String name);

}
