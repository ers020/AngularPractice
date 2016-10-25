package com.eric.data;

import java.util.List;

import com.eric.beans.Category;

public interface DataService {

	List<Category> requestCategories();

	Category requestCategoryById(int categoryId);

	void saveObject(Object object);

}
