package com.net.plus.wechat.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.plus.mapper.MetaImageMapper;
import com.net.plus.model.MetaImage;


@Service
public class MediaService {

	@Autowired
	public WechatCGIService wechatCgi;
	@Autowired
	public AccessTokenService accessToken;
	@Autowired
	public MetaImageMapper metaImageMapper;
	
	public Map uploadMedia(String svrSeq,String mediaId,String type){
		String url =  wechatCgi.buildUrl("media","upload",accessToken.getAccessToken(svrSeq),type);
		if("image".equals(type)){
			MetaImage image = metaImageMapper.selectByPrimaryKey(mediaId);
			wechatCgi.uploadFile(url,image.getImgName(),image.getImgData());
		}
		return null;
	}
}
