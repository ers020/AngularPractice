package com.eric.data;

import java.util.List;

import com.eric.beans.Category;
import com.eric.beans.Stock;

public interface BusinessDelegate {

	List<Category> requestCategories();

	Category requestCategoryById(int parseInt);

	void saveObject(Object object);

	

	
}
