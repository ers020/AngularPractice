package com.eric.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eric.data.BusinessDelegate;

@Controller
public class PostController {

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
	
	/**
	 * Mappings
	 */
	
	@RequestMapping(value="/createItem.do", method=RequestMethod.POST)
	public ModelAndView createItem(HttpServletRequest req, HttpServletRequest resp){
		ModelAndView model = new ModelAndView();
		
		return model;
	}
}
