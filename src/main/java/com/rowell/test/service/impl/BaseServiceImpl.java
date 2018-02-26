package com.rowell.test.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.util.CollectionUtils;

import com.rowell.test.dao.BaseDao;
import com.rowell.test.entity.User;
import com.rowell.test.service.BaseService;
import com.rowell.test.support.BaseUtil;
import com.rowell.test.support.Filter;
import com.rowell.test.support.PageInfo;
import com.rowell.test.support.Pager;
import com.rowell.test.support.QueryParams;
@SuppressWarnings({ "rawtypes", "unchecked" })
public class BaseServiceImpl<T>   implements BaseService<T>{
	private BaseDao baseDao;
	private Class<T> pojoClass;
	
	public BaseServiceImpl() {
		this.pojoClass = BaseUtil.getSuperClassGenricType(getClass());
	}

	public Class<T> getPojoClass() {
		return pojoClass;
	}

	public void setPojoClass(Class<T> pojoClass) {
		this.pojoClass = pojoClass;
	}

	public BaseDao getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public Page<T> search(T entity, PageInfo page) {
		return search(new QueryParams<T>(entity), page);
	}

	@Override
	public Page<T> search(QueryParams<T> queryParams, PageInfo page) {
		Sort sort = new Sort(Direction.DESC, page.getSortName());
		Pageable pageable=new PageRequest(page.getPage(), page.getLimit(), sort);
		Page<T> pager = baseDao.findAll(queryParams, pageable);
		return pager;
	}

	@Override
	public Pager<T> search(Pager<T> pager) {
		// TODO Auto-generated method stub
		Page<T> result = search(pager.getQuery(), pager.getPageInfo());
		Iterator<T> it = result.iterator();
		List<T> list=new ArrayList<T>();
		while(it.hasNext()){
			T u = it.next();
			list.add(u);
		}
		pager.setList(list);
		return pager;
	}
	
}
