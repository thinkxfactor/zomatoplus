package com.thinkxfactor.zomatoplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.model.Orders;
import com.thinkxfactor.zomatoplus.repository.OrdersRepository;


@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrdersRepository ordersRepository;

	@GetMapping("/getAll")
	public List<Orders> getAllAtmList() {
		return ordersRepository.findAll();
	}

	@PostMapping("/add")
	public Orders addRestaurant(@RequestBody Orders orders) {
		return ordersRepository.save(orders);
	}

}
