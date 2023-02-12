package com.foodList.foodList.Repository;

import com.foodList.foodList.Entitiy.MainFood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainFoodRepository extends JpaRepository<MainFood, Long> {
}
