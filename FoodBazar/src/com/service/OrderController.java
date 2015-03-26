package com.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Order;

@Controller
public class OrderController {

	@RequestMapping(value="submitOrder.do", method = RequestMethod.POST)
	public ModelAndView processOrder(@ModelAttribute Order order, HttpServletRequest req, HttpServletResponse res){
		System.out.println(order.getItemName());
		return  new ModelAndView("orderStatus");
		
	}
	
	
}
