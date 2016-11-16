package com.ssm.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.miemiedev.mybatis.paginator.domain.Order;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.ssm.demo.common.Page;
import com.ssm.demo.common.service.BaseQuery;
import com.ssm.demo.service.UserService;
import com.ssm.demo.service.query.UserQuery;

/**
 * UserController
 * 
 * @author Administrator
 * 
 */
@Controller
@RequestMapping(value = { "/user" })
public class UserController extends BaseController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = { "/userLogin" })
	public void login(ModelMap model, HttpServletRequest request) {
	}

	@RequestMapping(value = { "/index" })
	public void index(ModelMap model, HttpServletRequest request) {
		System.out.println();
	}

	@RequestMapping(value = { "/{id}" })
	public void show(ModelMap model, HttpServletRequest request, @RequestParam("id") String id) {
		System.out.println(id);
	}

	@RequestMapping(value = { "/userList" })
	public void list(ModelMap model, HttpServletRequest request) {
		BaseQuery query = new UserQuery();
		createResult(model,userService.findByQuery(query));
		model.addAttribute("chenshuai", "chenshuai");
		model.addAttribute("aaa", "aaa");
	}

	@RequestMapping(value = { "/userPage" })
	public ModelAndView userPage(ModelMap model, HttpServletRequest request,
			@RequestParam(required = false, defaultValue = "1") int page, //页码 默认1
			@RequestParam(required = false, defaultValue = "30") int limit,//每页显示条数 
			@RequestParam(required = false, defaultValue = "CREATE_DATE") String sort, 
			@RequestParam(required = false, defaultValue = "desc") String dir) {
		createResult(model, userService.findPageByQuery(new UserQuery(), new PageBounds(page, limit, Order.create(sort, dir))));
		return new ModelAndView("user/userList");
	}

}
