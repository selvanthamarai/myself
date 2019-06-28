package com.superMarket.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Items {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long ItemNo;


private String ItemName;


private String ItemQuantity;
	

//@ManyToOne(cascade = CascadeType.ALL)
//@JoinColumn(name="customer_id")
//private Customer customer;
//


@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
@JoinTable( name="cutomer_shop" ,joinColumns= {@JoinColumn(name="customerId")},inverseJoinColumns= {@JoinColumn(name="ItemNo")})
private List<Customer> customer;



public List<Customer> getCustomer() {
	return customer;
}



public void setCustomer(List<Customer> customer) {
	this.customer = customer;
}



public long getItemNo() {
	return ItemNo;
}



public void setItemNo(long itemNo) {
	ItemNo = itemNo;
}



public String getItemName() {
	return ItemName;
}



public void setItemName(String itemName) {
	ItemName = itemName;
}



public String getItemQuantity() {
	return ItemQuantity;
}



public void setItemQuantity(String itemQuantity) {
	ItemQuantity = itemQuantity;
}



//public Customer getCustomer() {
//	return customer;
//}
//
//
//
//public void setCustomer(Customer customer) {
//	this.customer = customer;
//}






	
}
