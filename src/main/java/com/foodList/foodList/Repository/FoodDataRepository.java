package com.foodList.foodList.Repository;

import com.foodList.foodList.Entitiy.FoodData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodDataRepository extends JpaRepository<FoodData, Long> {

    //List<FoodData> findByFoodName(String foodName);
    //List<FoodData> findByFoodNameLike(String foodName);
    //List<FoodData> findByFoodNameContaining(String foodName);
    List<FoodData> findByFoodNameIgnoreCaseContaining(String foodName);
    //List<FoodData> findByFoodNameStartingWith(String foodName);
    //List<FoodData> findByFoodNameEndingWith(String foodName);
}
