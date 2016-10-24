package com.eric.implement;

import org.springframework.stereotype.Service;

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

	
}
