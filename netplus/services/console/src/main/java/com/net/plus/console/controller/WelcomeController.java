package com.net.plus.console.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Administrator
 *
 * com.net.plus.console.controller.WelcomeController
 */
@Controller
public class WelcomeController {

	@RequestMapping(value = "welcome.do")
	public String welcomeResolver(Model model) {
		//model.addAttribute("user", "黎明你好");
		return "welcome";
	}
	@RequestMapping(value = "main.do")
	public String mainResolver(Model model) {
		//model.addAttribute("user", "黎明你好");
		return "main";
	}
	
	@RequestMapping(value = "MenuList.do")
	public String menuResolver(Model model) {
		//model.addAttribute("user", "黎明你好");
		return "MenuList";
	}
	@RequestMapping(value = "demo.do")
	public String demoResolver(Model model) {
		//model.addAttribute("user", "黎明你好");
		return "layouts/demo";
	}
}
