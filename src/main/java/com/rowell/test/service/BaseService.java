package com.rowell.test.service;

import org.springframework.data.domain.Page;

import com.rowell.test.support.PageInfo;
import com.rowell.test.support.Pager;
import com.rowell.test.support.QueryParams;

public interface BaseService<T> {
	public Page<T> search(T entity, PageInfo page) ;
	public Page<T> search(QueryParams<T> queryParams, PageInfo page) ;
	public Pager<T> search(Pager<T> pager) ;
}
