package com.eric.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eric.beans.Category;
import com.eric.beans.Stock;
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

	/*
	 * Methods
	 */
	public List<Category> requestCategories() {
		return dao.requestCategories();
	}
	
	public List<Stock> requestStock() {
		return dao.requestStock();
	}

	public Category requestCategoryById(int categoryId) {
		return dao.requestCategoryById(categoryId);
	}

	
	public void saveObject(Object object) {
		dao.saveObject(object);
		
	}


	
}
