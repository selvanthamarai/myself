package com.superMarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.superMarket.model.Customer;
import com.superMarket.model.Items;
import com.superMarket.repository.CustomerRepository;
import com.superMarket.repository.ItemsRepository;

@Component
public class Service {

	@Autowired
	CustomerRepository rep;
	@Autowired
	ItemsRepository repo;
	
	
	public Customer addDetail(Customer C) {
		return rep.save(C);
		
	}
	public Items insertDetail(Items D) {
		return repo.save(D);
		
	}
	
}
