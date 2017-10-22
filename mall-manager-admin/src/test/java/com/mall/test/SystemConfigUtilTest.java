package com.mall.test;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mall.pojo.User;
import com.mall.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-*.xml" })
public class SystemConfigUtilTest {
	
	@Resource
	private UserService userService;
	
	@Test
	public void add(){
		
		User model = new User();
		model.setCreated(new Date());
		model.setUpdated(new Date());
		model.setUsername("zong");
		model.setPassword("zong");
		this.userService.insert(model);
	}
}
