package com.superMarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superMarket.model.Items;

public interface ItemsRepository extends JpaRepository<Items, Long> {

}
