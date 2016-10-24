package com.eric.controllers;

import org.springframework.stereotype.Controller;

import com.eric.data.BusinessDelegate;

@Controller
public class RestController {
	
	/**
	 * Set up Business Delegate 
	 * Create Setters and Getters
	 */
	
	private BusinessDelegate businessDelegate;
	
	public void setBusinessDelegate(BusinessDelegate businessDelegate){
		this.businessDelegate = businessDelegate;
	}
	
	public BusinessDelegate getBusinessDelegate(){
		return businessDelegate;
	}
	
}
