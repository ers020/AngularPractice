package com.eric.implement;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eric.beans.Category;
import com.eric.beans.Stock;
import com.eric.data.DAO;

@Repository
@Transactional
public class DAOImpl implements DAO{

	/*
	 *  Attributes && Accessers
	 */
	
	private SessionFactory sessionFactory;
	private Session session;
	
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
		return session.createQuery("from Category").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Stock> requestStock() {
		Session ses = sessionFactory.getCurrentSession();
		setSession(ses);
		return session.createQuery("from Stock").getResultList();
	}

	public Category requestCategoryById(int categoryId) {
		Session ses = sessionFactory.getCurrentSession();
		setSession(ses);
		return session.get(Category.class, categoryId);
	}

	public void saveObject(Object object) {
		Session ses = sessionFactory.getCurrentSession();
		setSession(ses);
		session.save(object);
		
	}

}
