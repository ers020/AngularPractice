package com.eric.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eric.beans.Stock;
import com.eric.data.BusinessDelegate;

@Controller
@RequestMapping("/store")
public class RestController {
	
	/**
	 * Set up Business Delegate 
	 * Create Setters and Getters
	 */
	
	private BusinessDelegate businessDelegate;
	
	public void setBusinessDelegate(BusinessDelegate businessDelegate){
		this.businessDelegate = businessDelegate;
	}
	
	@RequestMapping(value="/stock", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Stock> getStock(HttpServletRequest req, HttpServletResponse resp){
		List<Stock> stock = businessDelegate.requestStock();
		return stock;
	}
	
	
}
