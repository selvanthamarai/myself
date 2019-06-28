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
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long customerId;
	
	private String customerName;
	
	
	private long customerMobileNo;
	
	private String customerAddress;
	
	
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="customer_id")

	
	
	
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable( name="cutomer_shop" ,joinColumns= {@JoinColumn(name="customerId")},inverseJoinColumns= {@JoinColumn(name="ItemNo")})
	private List<Items> items;
	
	
	
	
	public List<Items> getItems() {
		return items;
	}


	public void setItems(List<Items> items) {
		this.items = items;
	}


	public long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public long getCustomerMobileNo() {
		return customerMobileNo;
	}


	public void setCustomerMobileNo(long customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}


	public String getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


//	public List<Items> getItems() {
//		return items;
//	}
//
//
//	public void setItems(List<Items> items) {
//		this.items = items;
//	}


	


	
	
}
