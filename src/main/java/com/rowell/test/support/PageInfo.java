package com.rowell.test.support;

public class PageInfo {
	private int pageNo;
	private int pageSize;
	private String sortName;
	
	/**
	 * 
	 */
	public PageInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param page
	 * @param limit
	 * @param sortName
	 */
	public PageInfo(int page, int limit, String sortName) {
		super();
		this.pageNo = page;
		this.pageSize = limit;
		this.sortName = sortName;
	}
	public int getPage() {
		return pageNo;
	}
	public void setPage(int page) {
		this.pageNo = page;
	}
	public int getLimit() {
		return pageSize;
	}
	public void setLimit(int limit) {
		this.pageSize = limit;
	}
	public String getSortName() {
		return sortName;
	}
	public void setSortName(String sortName) {
		this.sortName = sortName;
	}
	
}
