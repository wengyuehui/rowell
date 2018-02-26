package com.rowell.test.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rowell.test.dao.UserDao;
import com.rowell.test.entity.User;
import com.rowell.test.service.UserService;
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
	@Autowired
	UserDao dao;
    @PostConstruct
    public void setBaseDao(){
        super.setBaseDao(dao);
    }
//	@Override
//	public Page<User> search1(User user, PageInfo page) {
//		// TODO Auto-generated method stub
//		Specification<User> spec=new Specification<User>() {
//			@Override
//			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//				// TODO Auto-generated method stub
//                if(null != user) {
//                	if(!StringUtils.isEmpty(user.getAccount())){
//                		Path<String> path = root.<String> get("account");
//                		Path<String> path2 = root.<String> get("id");
//                		Predicate restrictions=cb.equal(path, user.getAccount());
//                		Predicate p1 = cb.conjunction();
//                		Predicate or = cb.or(p1,cb.equal(path2,3),cb.equal(path2,4));
//                	    restrictions = cb.and(restrictions,or);
//                		query.where(restrictions);
//                	}
//                }
//                return null;
//			}
//		};
//		Sort sort = new Sort(Direction.DESC, page.getSortName());
//		Pageable pageable=new PageRequest(page.getPage(), page.getLimit(), sort);
//		Page<User> pager = dao.findAll(spec, pageable);
//		return pager;
//	}
	
}
