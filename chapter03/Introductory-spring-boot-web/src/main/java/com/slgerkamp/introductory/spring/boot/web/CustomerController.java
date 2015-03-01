package com.slgerkamp.introductory.spring.boot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.slgerkamp.introductory.spring.boot.domain.Customer;
import com.slgerkamp.introductory.spring.boot.service.CustomerService;

@Controller
@RequestMapping("customers")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(method = RequestMethod.GET)
	String list(Model model){
		List<Customer> customers = customerService.findAll();
		model.addAttribute("customers", customers);
		return "customers/list";
	}
}
