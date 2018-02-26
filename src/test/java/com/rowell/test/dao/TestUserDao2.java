package com.rowell.test.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rowell.test.entity.User;
import com.rowell.test.service.UserService;
import com.rowell.test.support.Pager;

public class TestUserDao2 {
	ApplicationContext act=new ClassPathXmlApplicationContext("classpath:spring.xml");
	@Test
	public void testSearch1(){
		UserService userService = act.getBean(UserService.class);
		User user=new User();
		user.setAccount("wyh2");
		user.setId(4);
		Pager<User> pager=new Pager<User>(0, 10, "id", user);
		userService.search(pager);
		System.out.println(pager.getList().size());
	}
}
