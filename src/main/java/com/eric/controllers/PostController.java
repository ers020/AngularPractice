package com.eric.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eric.beans.Category;
import com.eric.beans.Stock;
import com.eric.data.BusinessDelegate;

@Controller
public class PostController {

	/**
	 * Setup Business Delegate for use
	 * Create Getters and Setters
	 */
	private BusinessDelegate businessDelegate;
	
	public BusinessDelegate getBusinessDelegate() {
		return businessDelegate;
	}
	
	public void setBusinessDelegate(BusinessDelegate businessDelegate){
		this.businessDelegate = businessDelegate;
	}
	
	/**
	 * Test to see if DAO can do the call
	 */

	/**
	 * Constants
	 */
	
	private static final String INPUT = "redirect:/input";
	
	/**
	 * Mappings
	 */
	
	@RequestMapping(value="createItem.do", method=RequestMethod.POST)
	public ModelAndView createItem(HttpServletRequest req, HttpServletRequest resp){
		ModelAndView model = new ModelAndView();
		model.setViewName(INPUT);
		Category category = businessDelegate.requestCategoryById(Integer.parseInt(req.getParameter("categoryChoice")));
		//create Stock/Item Object
		Stock stock = new Stock(req.getParameter("name"), 
					req.getParameter("description"), 
					Double.parseDouble(req.getParameter("price")), 
					category);
		businessDelegate.saveObject(stock);
		
		return model;
	}
}
