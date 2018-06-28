package com.thinkxfactor.zomatoplus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_orders")
public class Orders {

	@Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "customerNumber")
	private String customerNumber;
	
	@Column(name = "restaurent")
	private String restaurent;
	
	@Column(name = "items")
	private String items;
	
	@Column(name = "total_amount")
	private String total_amount;
	
	@Column(name = "deilvary_address")
	private String delivaryAddress;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getRestaurent() {
		return restaurent;
	}

	public void setRestaurent(String restaurent) {
		this.restaurent = restaurent;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public String getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}

	public String getDelivaryAddress() {
		return delivaryAddress;
	}

	public void setDelivaryAddress(String delivaryAddress) {
		this.delivaryAddress = delivaryAddress;
	}
}
