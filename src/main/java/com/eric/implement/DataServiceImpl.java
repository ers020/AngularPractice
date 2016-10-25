package com.eric.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eric.beans.Category;
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

	@Override
	public List<Category> requestCategories() {
		List<Category> category = dao.requestCategories();
		return category;
	}

	@Override
	public Category requestCategoryById(int categoryId) {
		Category category = dao.requestCategoryById(categoryId);
		return category;
	}

	@Override
	public void saveObject(Object object) {
		dao.saveObject(object);
		
	}
	
}
