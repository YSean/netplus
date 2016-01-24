package com.net.plus.console.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.net.plus.mapper.SvrInfoMapper;
import com.net.plus.model.SvrInfo;

@Controller
@RequestMapping("/menus")
public class MenusController {

	Log log = LogFactory.getLog(MenusController.class);
	@Autowired
	SvrInfoMapper svrInfoMapper;
	
	@RequestMapping(value = "menusInit.do")
	public ModelAndView getMenus(String svrSeq){
		ModelAndView model = new ModelAndView("menus/menusInit");
		return model;
	}
	
}
