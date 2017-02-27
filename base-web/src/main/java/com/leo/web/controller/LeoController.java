package com.leo.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.leo.base.api.dto.User;
import com.leo.base.page.Page;
import com.leo.model.TResource;
import com.leo.service.TResourceService;
import com.leo.service.UserService;

@Controller
public class LeoController {
	
	@Autowired
	private TResourceService tResourceService;
	
	@Autowired
	private UserService userService;
   
//	@Autowired
//	private RedisUtil redis;
	
	
//	@RequestMapping("redisTest")
//	public @ResponseBody JSONObject redisTest(String key,String value){
//		JSONObject res=new JSONObject();
//		redis.set(key, value);
//		res.put("result", redis.get(key));
//		return res;
//	}
	
	@RequestMapping(value="addUser",method=RequestMethod.GET)
	public @ResponseBody JSONObject addUser(String userName){
		User user=new User();
		user.setUsername(userName);
		user.setPassword("123456");
		user.setCreateDate(new Date());
		user.setEnabled(true);
		this.userService.saveUser(user);
		return new JSONObject();
	}
	
	@RequestMapping("getList")
	public @ResponseBody Page getList(){
		Page page=new Page(1, 10);
		this.userService.queryPage(page);
		return page;
	}
	
	
	@RequestMapping("addResource")
	public @ResponseBody JSONObject addResource(){
		TResource t=new TResource();
		t.setCode(UUID.randomUUID().toString());
		t.setGmtCreate(new Date());
		t.setGmtModified(new Date());
		t.setName("系统菜单");
		this.tResourceService.add(t);
		return new JSONObject();
	}
	
	
	
	public static void main(String[] args) {
		Map<String, Object> table=new Hashtable<String, Object>();
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("key", "1");
		map.put("key2", "222");
		map.put(null, "abc");
		System.out.println(map.size());
		
//		map.putIfAbsent("", "");
		List<String> list=new ArrayList<String>();
		List<String> link=new LinkedList<String>();
//		String a="a";
//		String b="b";
//		String ab="ab";
//		System.out.println(a+b == ab);//a+b两个变量相加  需要在运行时才能确定其值, 到运行时jvm会为两者相加后产生一个新的对象
//		System.out.println("a"+"b" == ab);//在编译时 a+b 就变成 ab了
//		
//		final String afinal="a";
//		String result=afinal+"b";
//		System.out.println(result == ab);//result=afinal+”b”，afinal是个final的变量， result在编译时也已经被转变为了”ab”，和”ab”在常量池中同样为同一地址，因此result==ab为true。
//		String plus=a+"b";
//		System.out.println(plus == ab);
//		System.out.println(plus.intern() == ab);//这里的不同点在于调用了plus.intern()方法，这个方法的作用是获取plus指向的常量池地址，因此plus.intern()==ab为true。
	}
}
