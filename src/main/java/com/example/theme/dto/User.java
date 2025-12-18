package com.example.theme.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private String loginId;
	private String loginPw;
	private String name;
	private String regDate;
	private String updateDate;
}
