package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dao.CategoryDAO;
import com.spring.domain.Category;

@Controller
public class CategoryController {

	@Autowired
	CategoryDAO categorydao;

	@RequestMapping("/")
	public ModelAndView createCategory() {
		Category category=new Category();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject(category);
		return mv;
	}

	@RequestMapping("/home")
	public String categoryList(@ModelAttribute("category") Category category,Model model) {
		List<Category> categories;
		String viewName=null;
		boolean res = categorydao.createCategory(category);
		if(res)
		{
			categories=categorydao.listCategories();
			model.addAttribute(categories);
			viewName="home";
		}
		else
		{
			viewName="index";
		}
		return viewName;
	}
}