package com.foodList.foodList.Service;

import com.foodList.foodList.Dto.FoodDto;

public interface FoodService extends BaseService<FoodDto>{
    FoodDto add(FoodDto foodDto);
}
