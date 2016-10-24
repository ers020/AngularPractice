package com.eric.controllers;

import org.springframework.stereotype.Controller;

import com.eric.data.BusinessDelegate;

@Controller
public class BaseController {

	
	/**
	 * Setup Business Delegate for use
	 * Create Getters and Setters
	 */
	private BusinessDelegate businessDelegate;
	
	public void setBusinessDelegate(BusinessDelegate businessDelegate){
		this.businessDelegate = businessDelegate;
	}
	
	public BusinessDelegate getBusinessDelegate(){
		return businessDelegate;
	}
	
}
