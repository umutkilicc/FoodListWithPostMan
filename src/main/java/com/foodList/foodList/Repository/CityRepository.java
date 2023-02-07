package com.foodList.foodList.Repository;

import com.foodList.foodList.Entitiy.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
