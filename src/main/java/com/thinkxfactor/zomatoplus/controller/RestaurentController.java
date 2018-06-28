package com.thinkxfactor.zomatoplus.controller;

import java.util.List;

import com.thinkxfactor.zomatoplus.model.Items;
import com.thinkxfactor.zomatoplus.model.Restaurant;
import com.thinkxfactor.zomatoplus.repository.ItemsRepository;
import com.thinkxfactor.zomatoplus.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/restaurant")
public class RestaurentController {

	@Autowired
	private RestaurantRepository restaurantRepository;

	@Autowired
	private ItemsRepository itemsRepository;

	@GetMapping("/getAll")
	public List<Restaurant> getAllRestaurant() {
		return restaurantRepository.findAll();
	}

	@PostMapping("/add")
	public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	@PostMapping("/addItems")
	public Items addItems(@RequestBody Items item) {
		return itemsRepository.save(item);
	}

	@GetMapping("/getItems")
	public List<Items> getItems(@RequestParam("restaurentId") long restaurentId) {
		return itemsRepository.findAllByRestaurantId(restaurentId);
	}


}
