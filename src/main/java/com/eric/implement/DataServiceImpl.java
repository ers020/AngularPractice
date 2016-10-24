package com.eric.implement;

import org.springframework.stereotype.Service;

import com.eric.data.DAO;
import com.eric.data.DataService;

@Service
public class DataServiceImpl implements DataService{

	@SuppressWarnings("unused")
	private DAO dao;
	
	public void setDAO(DAO dao){
		this.dao = dao;
	}
	
}
