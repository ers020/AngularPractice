package com.eric.implement;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.eric.beans.Category;
import com.eric.data.DAO;

public class DAOImpl implements DAO{

	/*
	 *  Attributes && Accessors
	 */
	
	private SessionFactory sessionFactory;
	private Session session;
	
	public DAOImpl(){
		super();
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
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<Category> requestCategories() {
		Session ses = sessionFactory.getCurrentSession();
		setSession(ses);
		List<Category> category = session.createQuery("from Category").getResultList();
		return category;
	}
}
