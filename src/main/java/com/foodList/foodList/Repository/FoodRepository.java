package com.foodList.foodList.Repository;

import com.foodList.foodList.Entitiy.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface FoodRepository extends JpaRepository<Food,Integer> {

        Optional<Food> findById (Integer id);

        List<Food> findByCityCity (String city);

        List<Food> findByCityCityAndDateBetween(String city, String startDate, String endDate);
}
