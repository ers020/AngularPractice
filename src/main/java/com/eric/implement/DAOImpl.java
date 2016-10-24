package com.eric.implement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.eric.data.DAO;

public class DAOImpl implements DAO{

	/*
	 *  Attributes && Accessors
	 */
	
	private SessionFactory sessionFactory;
	private Session session;
	
	public void setSf(SessionFactory sessionFactory) {
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
}
