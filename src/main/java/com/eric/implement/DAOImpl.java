package com.eric.implement;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.eric.beans.Category;
import com.eric.data.DAO;

@Repository
@Transactional
public class DAOImpl implements DAO{

	/*
	 *  Attributes && Accessors
	 */
	
	private SessionFactory sessionFactory;
	private Session session;
	
	public DAOImpl(){
		super();
	}
	
	public DAOImpl(SessionFactory factory) throws InterruptedException {
		this();
		setSessionFactory(factory);
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		session = getSession();
	}
	
	public void setSession(Session session){
		
		this.session = session;
	}
	public Session getSession() {
		
		if(session == null){
			
			setSession(sessionFactory.openSession());
		}
		
		return session;
	}

	
	@SuppressWarnings("unchecked")
	public List<Category> requestCategories() {
		Session ses = sessionFactory.getCurrentSession();
		setSession(ses);
		List<Category> category = session.createQuery("from Category").getResultList();
		return category;
	}

	public Category requestCategoryById(int categoryId) {
		System.err.println("Reached DAO Implementation.");
		System.err.println("Category Id = " + categoryId);
		Session ses = sessionFactory.getCurrentSession();
		setSession(ses);
		Category category = session.get(Category.class, categoryId);
		System.err.println("Hit Database!");
		System.err.println("Category = " +category.getCategory());
		return category;
	}

	public void saveObject(Object object) {
		Session ses = sessionFactory.getCurrentSession();
		setSession(ses);
		session.save(object);
		
	}
}
