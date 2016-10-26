package com.eric.data;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eric.beans.Category;
import com.eric.beans.Stock;

@Service
public interface BusinessDelegate {

	List<Category> requestCategories();
	List<Stock> requestStock();

	Category requestCategoryById(int categoryId);

	void saveObject(Object object);


	

	
}
