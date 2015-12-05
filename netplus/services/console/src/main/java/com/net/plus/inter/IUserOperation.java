package com.net.plus.inter;

import java.util.List;

import com.net.plus.model.Article;
import com.net.plus.model.User;

public interface IUserOperation {
    
	public User selectUser(String id);
	public List<User> selectUsersByUserName(String userName);	
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(int id);
	
	public List<Article> getUserArticles(int id);
	
}
