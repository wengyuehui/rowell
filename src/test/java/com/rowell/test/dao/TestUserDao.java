package com.rowell.test.dao;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;

import com.rowell.test.entity.User;
import com.rowell.test.service.UserService;
import com.rowell.test.support.Filter;
import com.rowell.test.support.PageInfo;
import com.rowell.test.support.Pager;
import com.rowell.test.support.QueryParams;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml" })
public class TestUserDao {
	@Autowired
	UserDao userRepository;
	@Autowired
	UserService userService;
	@Test
	public void testSearch1(){
		User user=new User();
		user.setAccount("wyh2");
		user.setId(4);
		Pager<User> pager=new Pager<User>(0, 10, "id", user);
		userService.search(pager);
		System.out.println(pager.getList().size());
	}
//	@Test
//	public void testSearch1(){
//		User user=new User();
//		user.setAccount("wyh2");
//		user.setId(4);
//		PageInfo page=new PageInfo(0, 10, "id");
//		Page<User> search = userService.search(user, page);
//		Iterator<User> it = search.iterator();
////		List list = CollectionUtils.arrayToList(it);
//		while(it.hasNext()){
//			User u = it.next();
//			System.out.println(u.getAccount());
//		}
//	}
//	@Test
//	public void testSearch2(){
//		PageInfo page=new PageInfo(0, 10, "id");
//		QueryParams<User> queryParams=new QueryParams<User>();
//		queryParams.or(Filter.eq("id", 2),Filter.eq("id", 4));
//		Page<User> search = userService.search(queryParams, page);
//		Iterator<User> it = search.iterator();
//		while(it.hasNext()){
//			User u = it.next();
//			System.out.println(u.getAccount());
//		}
//	}
}
