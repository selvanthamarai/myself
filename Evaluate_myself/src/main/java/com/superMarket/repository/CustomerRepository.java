package com.superMarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superMarket.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
