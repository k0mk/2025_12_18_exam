package com.example.theme.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.theme.dto.Article;
import com.example.theme.service.ArticleService;
import com.example.theme.util.Util;


@Controller
public class ArticleController {
	
	private ArticleService articleService;

	public ArticleController(ArticleService articleService) {
		this.articleService = articleService;
	}

	@GetMapping("/article/list")
	public String showList(Model model,@RequestParam(defaultValue = "0")int startPage, @RequestParam(defaultValue = "10")int endPage) {
		List<Article> articles = articleService.getList(startPage, endPage);
		
		model.addAttribute("articles", articles);
		
		return "/article/list";
	}
	
	@GetMapping("/article/write")
	public String showWrite() {
		return "/article/write"; 
	}
	
	
	@GetMapping("/article/dowrtie")
	public String dowrite(String title, String content) {
		articleService.dowrite(title, content);
		return Util.replace("게시물 작성 완료", "/article/list");
	}
	
	@GetMapping("/article/detail")
	public String getMethodName(Model model, int id) {
		Article article = articleService.getarticle(id);
		model.addAttribute("article", article);
		return "/article/detail";
	}
	
	
	
}
