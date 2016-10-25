package com.eric.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eric.beans.Category;
import com.eric.data.BusinessDelegate;
import com.eric.data.DataService;

@Service
public class BusinessDelegateImpl implements BusinessDelegate{

		/*
	 *  Attributes && Accessors
	 */
	
	@SuppressWarnings("unused")
	private DataService dataService;
	
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}

	@Override
	public List<Category> requestCategories() {
		List<Category> category = dataService.requestCategories();
		return category;
	}

	
}
