package com.example.theme.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.theme.dto.Article;

@Mapper
public interface ArticleDao {

	@Select("""
			SELECT * FROM article
				LIMIT #{startPage}, #{endPage}
			""")
	public List<Article> getList(int startPage, int endPage);

	@Select("""
			SELECT a.*, m.name as writerName
				FROM article a
				inner join member m
				on a.memberId = m.id 
				where a.id = #{id}
			""")
	public Article getarticle(int id);

	@Insert("""
			INSERT INTO article
				SET memberId = 1
				,	title = #{title}
				,	content = #{content}
				,	regDate = NOW()
				,	updateDate = NOW()
			""")
	public void dowrite(String title, String content);
	
	
}
