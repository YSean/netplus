package com.net.plus.wechat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

	@Autowired
	public AccessTokenService token;
	/**
	 * 
	 * @param svrSeq
	 * @return
	 */
	public Object createMenu(String svrSeq){
		String accessToken =  token.getAccessToken(svrSeq);
		String url = WechatCGIService.buildUrl("menu", "create",accessToken);
		WechatCGIService.sendParams(url, null);
		return null;
	}
	/**
	 * menu + conditionalmenu
	 * @param svrSeq
	 * @return
	 */
	public Object getMenu(String svrSeq){
		String accessToken =  token.getAccessToken(svrSeq);
		String url = WechatCGIService.buildUrl("menu", "get",accessToken);
		return null;
	}
	/**
	 * 删除所有菜单
	 * @param svrSeq
	 * @return
	 */
	public Object delMenu(String svrSeq){
		String accessToken =  token.getAccessToken(svrSeq);
		String url = WechatCGIService.buildUrl("menu", "delete",accessToken);
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
		String accessToken =  token.getAccessToken(svrSeq);
		String url = WechatCGIService.buildUrl("menu", "addconditional",accessToken);
		return null;
	}
	/**
	 * {menuid:''}
	 * @param svrSeq
	 * @return
	 */
	public Object delConditional(String svrSeq){
		String accessToken =  token.getAccessToken(svrSeq);
		String url = WechatCGIService.buildUrl("menu", "delconditional",accessToken);
		return null;
	}
	
	/**
	 * 测试用户发起拿到的菜单信息
	 * @param svrSeq
	 * @return
	 */
	public Object trymatch(String svrSeq){
		String accessToken =  token.getAccessToken(svrSeq);
		String url = WechatCGIService.buildUrl("menu", "trymatch",accessToken);
		return null;
	}
	/**
	 * 获取微信菜单配置信息
	 * @param svrSeq
	 * @return
	 */
	public Object getWechatMenusConfir(String svrSeq){
		String accessToken =  token.getAccessToken(svrSeq);
		String url = WechatCGIService.buildUrl("default", "get_current_selfmenu_info",accessToken);
		return null;
	}
}
