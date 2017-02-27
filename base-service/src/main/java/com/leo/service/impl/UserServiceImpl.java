package com.leo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leo.base.api.dto.User;
import com.leo.base.page.Page;
import com.leo.mapper.UserMapper;
import com.leo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper mapper;
    
	@Transactional
	public User loadUserByUsername(String username) {

		return mapper.loadUserByUsername(username);
	}
    
	@Transactional
	public void saveUser(User user) {
         mapper.saveUser(user);
	}

	public List<User> getUserList() {
		return mapper.getUserList();
	}

	@Override
	public void queryPage(Page page) {
		List<User> userList=mapper.queryPage(page);
		page.setRecords(userList);
	}

}
