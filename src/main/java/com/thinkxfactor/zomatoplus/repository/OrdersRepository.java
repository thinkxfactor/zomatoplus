package com.thinkxfactor.zomatoplus.repository;


import com.thinkxfactor.zomatoplus.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrdersRepository extends JpaRepository<Orders,Long> {



}
