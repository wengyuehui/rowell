package com.rowell.test.support;

import java.util.List;

public class Pager<T>{
	private QueryParams<T> query;
	private PageInfo pageInfo;
	private List<T> list;
	
	/**
	 * 
	 */
	public Pager() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param query
	 * @param pageInfo
	 */
	public Pager(int page, int limit, String sortName,T entity) {
		super();
		pageInfo=new PageInfo(page, limit, sortName);
		query=new QueryParams<T>(entity);
	}

	public QueryParams<T> getQuery() {
		return query;
	}

	public void setQuery(QueryParams<T> query) {
		this.query = query;
	}

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
}
