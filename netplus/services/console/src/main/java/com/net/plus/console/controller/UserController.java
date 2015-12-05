package com.net.plus.console.controller;
import java.io.InputStream;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.net.plus.exception.NetValidationException;
import com.net.plus.inter.IUserOperation;
import com.net.plus.model.User;

@Controller
@RequestMapping("/user")
public class UserController {
	Log log = LogFactory.getLog(UserController.class);
	
	@Autowired
	IUserOperation userMapper;
	
	@RequestMapping("/login")
	public String login(
			@RequestParam(value="username", required=true) String id,
			@RequestParam(value="password", required=true) String password) throws Exception{
		User user =userMapper.selectUser(id);
		if(user==null){
			throw new NetValidationException("validation.user.unexist");
		}
		//需要进行加密之后进行判断
		if(!password.equals(user.getPassword())){
			throw new NetValidationException("validation.user.password.error");
		}
		//设置到shiro中
		return "main";
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
