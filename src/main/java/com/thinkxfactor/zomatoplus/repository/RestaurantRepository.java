package com.thinkxfactor.zomatoplus.repository;

import java.util.List;

import com.thinkxfactor.zomatoplus.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;





public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {

	List<Restaurant> findByCity  (String cityName);

}
