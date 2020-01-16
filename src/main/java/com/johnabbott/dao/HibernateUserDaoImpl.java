package com.johnabbott.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.johnabbott.model.UserEntity;

@Repository
public class HibernateUserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<UserEntity> search(UserEntity user) {
		List<UserEntity> uiList = null;
		Session session = sessionFactory.getCurrentSession();
		Criteria c = session.createCriteria(UserEntity.class);
		Example example = Example.create(user);
		c.add(example);
		uiList = c.list();

		return uiList;
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public int insertUser(UserEntity user) {
		sessionFactory.getCurrentSession().save(user);
		return 1;
	}

//	@Override
//	public UserEntity check(String email, String password) {
//		String hql = "from UserEntity where email= :user_email and password=user_password";
//		Query query = getSession().createQuery(hql);
//		query.setParameter("user_email", email);
//		query.setParameter("user_password", password);
//		List list = query.list();
//		Iterator it = list.iterator();
//		while (it.hasNext()) {
//			if (list.size() != 0) {
//				UserEntity user = (UserEntity) it.next();
//				return user;
//			}
//		}
//		sessionFactory.close();
//		return null;
//
//	}

}
