package com.thinkxfactor.zomatoplus.repository;


import com.thinkxfactor.zomatoplus.model.Items;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ItemsRepository extends JpaRepository<Items,Long> {

    List<Items> findAllByRestaurantId(long restaurentId);

}
