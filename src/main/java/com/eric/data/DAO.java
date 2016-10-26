package com.eric.data;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.eric.beans.Category;
import com.eric.beans.Stock;

@Repository
public interface DAO{

	List<Category> requestCategories();
	List<Stock> requestStock();
	
	Category requestCategoryById(int categoryId);

	void saveObject(Object object);

}
