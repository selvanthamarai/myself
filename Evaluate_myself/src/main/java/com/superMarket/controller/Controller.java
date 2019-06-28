package com.superMarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superMarket.model.Customer;
import com.superMarket.model.Items;
import com.superMarket.service.Service;

@RestController
@RequestMapping("check")
public class Controller {

	@Autowired
	Service service;
	
	@PostMapping("add")
	public Customer add(@RequestBody Customer A) {
		return service.addDetail(A);
		
	}
	@PostMapping("insert")
	public Items insert(@RequestBody Items B) {
		return service.insertDetail(B);
		
	}

}
