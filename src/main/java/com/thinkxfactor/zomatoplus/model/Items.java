package com.thinkxfactor.zomatoplus.model;

import javax.persistence.*;

@Entity
@Table(name="tbl_items")
public class Items {

	@Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

	@Column(name = "restaurant_id")
	private Long restaurantId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "description")
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}
}
