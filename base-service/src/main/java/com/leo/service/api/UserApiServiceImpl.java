package com.leo.service.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.leo.base.api.UserApiService;
import com.leo.base.api.dto.User;

@Service
public class UserApiServiceImpl implements UserApiService {
	
	public List<User> getUserList() {
		List<User> reslist=new ArrayList<User>();
		return reslist;
	}

}
