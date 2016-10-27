package com.eric.implement;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.eric.beans.Category;
import com.eric.beans.Stock;
import com.eric.data.DAO;

@Repository
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


	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@SuppressWarnings("unchecked")
	public List<Category> requestCategories() {
		Session ses = sessionFactory.getCurrentSession();
		setSession(ses);
		Criteria crit = session.createCriteria(Category.class);
		return crit.list();
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@SuppressWarnings("unchecked")
	public List<Stock> requestStock() {
		Session ses = sessionFactory.getCurrentSession();
		setSession(ses);
		Criteria crit = session.createCriteria(Stock.class);
		return crit.list();
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public Category requestCategoryById(int categoryId) {
		Session ses = sessionFactory.getCurrentSession();
		setSession(ses);
		Criteria crit = session.createCriteria(Category.class).add(Restrictions.eq("id", categoryId));
		return (Category) crit.uniqueResult();
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void saveObject(Object object) {
		Session ses = sessionFactory.getCurrentSession();
		setSession(ses);
		session.save(object);
		
	}

}
