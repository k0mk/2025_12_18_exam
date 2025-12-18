package com.example.theme.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.theme.dao.ArticleDao;
import com.example.theme.dto.Article;

@Service
public class ArticleService {

private ArticleDao articleDao;

public ArticleService(ArticleDao articleDao) {
	this.articleDao = articleDao;
}
	public List<Article> getList(int startPage, int endPage) {
		return articleDao.getList(startPage, endPage);
	}
	public Article getarticle(int id) {
		return articleDao.getarticle(id);
	}
	public void dowrite(String title, String content) {
		articleDao.dowrite(title, content);
	}

}
