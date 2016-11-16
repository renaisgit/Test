package com.ssm.demo.controller;

import org.springframework.ui.ModelMap;

/**
 * 控制器
 * @author CHEN SHUAI
 *
 */
public abstract class BaseController {
	protected void createResult(ModelMap model, Object result) {
		model.addAttribute("result", result);
	}
}
