package com.vincent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTemplateTest {

	@Autowired
    private RedisConnectionFactory redisConnectionFactory;
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	//注入的是RedisTemplate,没有设置泛型
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Test
	public void fun() {
	
		ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
		
		valueOperations.set("k1", "v1");
		
		System.out.println(valueOperations.get("k1"));
		
	}
	
}
