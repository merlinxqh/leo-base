package com.leo.web.controller;

import com.leo.base.api.dto.User;

public class GcTest {
   public static void main(String[] args) {
	User user=new User();
	
	System.out.println(user);
	user=null;
	System.gc();
	System.out.println(user);
}
}
