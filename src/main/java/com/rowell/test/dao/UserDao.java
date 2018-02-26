package com.rowell.test.dao;

import java.util.List;

import com.rowell.test.entity.User;
public interface UserDao extends BaseDao<User, Integer> {
	public User getById(Integer id);
	public List<User> findByAccountLike(String account);
}
