package com.net.plus.console.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Administrator com.net.plus.console.controller.Welcome
 */
@Controller
public class Welcome {

	@RequestMapping(value = "welcome.do")
	public String index_jsp(Model model) {
		model.addAttribute("liming", "黎明你好");
		return "main";
	}
}
