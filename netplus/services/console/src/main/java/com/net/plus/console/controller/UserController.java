package com.net.plus.console.controller;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.net.plus.inter.IUserOperation;
import com.net.plus.model.Article;

@Controller
@RequestMapping("/article")
public class UserController {
	Log log = LogFactory.getLog(UserController.class);
	
	@Autowired
	IUserOperation userMapper;
	
	@RequestMapping("/list")
	public ModelAndView listall(HttpServletRequest request,HttpServletResponse response) throws Exception{
		List<Article> articles=userMapper.getUserArticles(1); 
		ModelAndView mav=new ModelAndView("list");
		mav.addObject("articles",articles);
		log.info("===============================");
		send();
		return mav;
	}
	
	public void send() throws Exception{
		HttpClient client = new DefaultHttpClient();
        String path = "http://www.baidu.com";
        HttpPost post = new HttpPost(path);
        /*Vendor v = new Vendor();
        v.setName("传输数据");
        v.setDescription("数据传输");
        v.setCreateDate(new Date());
        v.setId(20);*/
        String content = "{}";
        StringEntity entity = new StringEntity(content);
        entity.setContentEncoding("UTF-8");
        entity.setContentType("application/json");
        post.setEntity(entity);
        HttpResponse response = client.execute(post);
        System.out.println("响应状态码：" + response.getStatusLine().getStatusCode());
        InputStream in = response.getEntity().getContent();
        String text = new String(StreamUtils.copyToByteArray(in));
        System.out.println("服务器端响应的数据：" + text);
	}
}
