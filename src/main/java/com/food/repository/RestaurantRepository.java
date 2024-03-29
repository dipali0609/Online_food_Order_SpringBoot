package com.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.dao.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer>
{

}
