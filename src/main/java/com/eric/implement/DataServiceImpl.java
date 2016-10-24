package com.eric.implement;

import org.springframework.stereotype.Service;

import com.eric.data.DAO;
import com.eric.data.DataService;

@Service
public class DataServiceImpl implements DataService{

	/*
	 *  Attributes && Accessors
	 */
	
	private DAO dao;
	
	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
}
