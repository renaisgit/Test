package com.ssm.demo.controller;

import org.springframework.ui.ModelMap;

public abstract class BaseController {
	protected void createResult(ModelMap model, Object result) {
		model.addAttribute("result", result);
	}
}
