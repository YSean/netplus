package com.net.plus.wechat.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

	@Autowired
	public WechatCGIService wechatCgi;
	@Autowired
	public AccessTokenService accessToken;
	/**
	 * 
	 * @param svrSeq
	 * @return
	 */
	public Object createMenu(String svrSeq){
		String url =  wechatCgi.buildUrl("menu","create",accessToken.getAccessToken(svrSeq));
		Map<String,Object>input = new HashMap();
		List<Map<String,Object>> menus = new ArrayList<Map<String,Object>>();
		Map<String,Object> menu1 = new HashMap();
		menu1.put("type","scancode_waitmsg");
		menu1.put("name","扫码带提示");
		menu1.put("key","rselfmenu_0_0");
		menus.add(menu1);
		input.put("button", menus);
		return wechatCgi.sendParams(url,input);
	}
	/**
	 * menu + conditionalmenu
	 * @param svrSeq
	 * @return
	 */
	public Object getMenu(String svrSeq){
		return null;
	}
	/**
	 * 删除所有菜单
	 * @param svrSeq
	 * @return
	 */
	public Object delMenu(String svrSeq){
		return null;
	}
	/**
	 * 菜单匹配规则
		"matchrule":{
			"group_id":"2",
			"sex":"1",	男（1）女（2）
			"country":"中国",
			"province":"广东",
			"city":"广州",
			"client_platform_type":"2" ,客户端版本IOS(1), Android(2),Others(3)
			"language":"zh_CN"	zh_CN/zh_TW/zh_HK/en/id(印尼)/ko(韩国)
		}
		返回 menuid
	 * @param svrSeq
	 * @return
	 */
	public Object addConditional(String svrSeq){
		String url = wechatCgi.buildUrl("menu", "addconditional",accessToken.getAccessToken(svrSeq));
		return null;
	}
	/**
	 * {menuid:''}
	 * @param svrSeq
	 * @return
	 */
	public Object delConditional(String svrSeq){
		String url = wechatCgi.buildUrl("menu", "delconditional",accessToken.getAccessToken(svrSeq));
		return null;
	}
	
	/**
	 * 测试用户发起拿到的菜单信息
	 * @param svrSeq
	 * @return
	 */
	public Object trymatch(String svrSeq){
		String url = wechatCgi.buildUrl("menu", "trymatch",accessToken.getAccessToken(svrSeq));
		return null;
	}
	/**
	 * 获取微信菜单配置信息
	 * @param svrSeq
	 * @return
	 */
	public Object getWechatMenusConfir(String svrSeq){
		String url = wechatCgi.buildUrl("default", "get_current_selfmenu_info",accessToken.getAccessToken(svrSeq));
		wechatCgi.sendParams(url);
		return null;
	}
}
