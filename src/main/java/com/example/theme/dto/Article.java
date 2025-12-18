package com.example.theme.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {

	private int id;
	private int mameberid;
	private String title;
	private String content;
	private String regDate;
	private String updateDate;
	private String writerName;
}
