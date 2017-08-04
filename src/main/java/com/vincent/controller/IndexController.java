package com.vincent.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@RequestMapping(method=RequestMethod.GET)
	public String index(HttpSession session) {
		
		System.out.println(session.getAttribute("username"));
		
		System.out.println(stringRedisTemplate.hasKey("k1"));
		
		return "ok";
	}
	
}
