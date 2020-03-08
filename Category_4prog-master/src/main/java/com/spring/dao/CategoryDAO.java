package com.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spring.domain.Category;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.domain.Category;

@Transactional
@Repository
public class CategoryDAO {
	@Autowired
	public SessionFactory sessionFactory;

	public Boolean createCategory(Category categoryIns) {
		Session session = this.sessionFactory.getCurrentSession();

		if (session.save(categoryIns) == null)
			return false;
		else
			return true;

	}

	public List<Category> listCategories() {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Category.class);
		List<Category> list = criteria.list();
		return list;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}