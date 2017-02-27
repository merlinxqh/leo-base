package com.leo.service;

import java.util.List;

import com.leo.base.api.dto.User;
import com.leo.base.page.Page;

public interface UserService {
	
	User loadUserByUsername(String username);
	
	void saveUser(User user);
	
	List<User> getUserList();
	
	void queryPage(Page page);
}
