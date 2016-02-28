package com.net.plus.wechat.service;

import java.sql.Timestamp;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.plus.common.Constants;
import com.net.plus.mapper.SvrInfoMapper;
import com.net.plus.model.SvrInfo;
import com.net.plus.service.HttpClientService;
import com.net.plus.util.Utils;

@Service
public class AccessTokenService {
	
	Log log = LogFactory.getLog(AccessTokenService.class);
	
	@Resource
	public HttpClientService httpService;
	@Autowired
	public SvrInfoMapper svrInfoMapper;
	
	public Long defaultTimeout = 7200L;
	public final static String accessTokenUrl = Constants.wechatApiCgi + "token?grant_type=client_credential&appid=%s&secret=%s";
	
	//直接通过svrSeq
	public String getAccessToken(String svrSeq){
		if(svrSeq == null){
			log.warn("@@@@svrSeq is null");
			return null;
		}
		//如果还没有初始化obj,则从数据库查询
		SvrInfo svr = svrInfoMapper.selectByPrimaryKey(svrSeq);
		if(svr==null || !Constants.OK.equals(svr.getState())){
			log.warn("@@@@{svrSeq:" + svrSeq + "} has no svrInfo");
			return null;
		}
		return getAccessToken(svr);
	}
	public String getAccessToken(SvrInfo svr){
		if(svr==null){
			log.warn("@@@@svrInfo is null");
			return null;
		}
		AccessTokenService obj = null;
		//如果初始化过，直接使用
		if(svr.getAccessToken()!=null){
			obj = getInstance(svr.getAccessToken());
		}
		//如果没有初始化或者已经超时
		if(obj==null||isTimeout(obj.getCtime().getTime(),obj.getTimeout())){
			String remoteToken = getRemoteToken(svr.getAppId(),svr.getAppSecret());
			if(remoteToken==null)return null;
			svr.setAccessToken(remoteToken);
			//有可能第一次初始化svr就进行获取
			if(svr.getSvrSeq()!=null){
				svrInfoMapper.updateByPrimaryKeySelective(svr);
			}
			obj = getInstance(remoteToken);
			return obj.getToken();
		}else{
			return obj.getToken();
		}
	}
	private String getRemoteToken(String appId,String appSecret){
		Map map = httpService.send(String.format(accessTokenUrl, appId,appSecret));
		if(map.get("access_token")==null){
			log.error(Utils.buildString("@@@@{",appId,"=",appSecret,"}获取凭证失败"));
			return null;
		}
		return Utils.buildString(
				String.valueOf(defaultTimeout),",",
				String.valueOf(System.currentTimeMillis()),",",
				map.get("access_token").toString());
	}
	private boolean isTimeout(Long timeout,Long timestamp){
		if((timestamp + timeout*1000) < System.currentTimeMillis()){
			return true;
		}else{
			return false;
		}
	}
	private AccessTokenService getInstance(String accessToken){
		AccessTokenService obj = new AccessTokenService();
		String [] tokens = accessToken.split(",");
		obj.ctime = new Timestamp(new Long(tokens[0]));
		obj.timeout = new Long(tokens[1]);
		obj.token = tokens[2];
		return obj;
	}
	/*public static AccessToken getAccessToken(){
		AccessToken token  = new AccessToken();
		
	}*/
	private Timestamp ctime;
	private Long timeout;
	private String token;
	public Timestamp getCtime() {
		return ctime;
	}
	public void setCtime(Timestamp ctime) {
		this.ctime = ctime;
	}
	public Long getTimeout() {
		return timeout;
	}
	public void setTimeout(Long timeout) {
		this.timeout = timeout;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}
