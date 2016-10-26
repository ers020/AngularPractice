package com.eric.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eric.beans.Category;
import com.eric.beans.Stock;
import com.eric.data.BusinessDelegate;
import com.eric.data.DataService;

@Service
public class BusinessDelegateImpl implements BusinessDelegate{

		/*
	 *  Attributes && Accessors
	 */
	
	private DataService dataService;
	
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}

	/*
	 * Methods
	 * 
	 */
	
	public List<Category> requestCategories() {
		return dataService.requestCategories();
	}
	
	public List<Stock> requestStock() {
		return dataService.requestStock();
	}

	
	public Category requestCategoryById(int categoryId) {
		return dataService.requestCategoryById(categoryId);

	}

	
	public void saveObject(Object object) {
		dataService.saveObject(object);
		
	}

	


	
}
