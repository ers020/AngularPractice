package com.eric.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eric.beans.Category;
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
	
	/**
	 * Mappings
	 */
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String indexPage(HttpServletRequest req){
		return "redirect:/pages/index.html";
	}
	
	@RequestMapping(value="/input", method=RequestMethod.GET)
	public String inputPage(HttpServletRequest req, HttpServletResponse resp){
		List<Category> category = new ArrayList<Category>();
		HttpSession session = req.getSession(false);
		if(session == null){
			session = req.getSession();
		}
		session.setAttribute("category", category);
		
		return "input";
	}
	
}
