package com.foodList.foodList.Service;

import com.foodList.foodList.Dto.CityDto;
import com.foodList.foodList.Dto.FoodDataDto;
import com.foodList.foodList.Entitiy.City;
import com.foodList.foodList.Entitiy.FoodData;
import com.foodList.foodList.Repository.FoodDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodDataService {

    @Autowired
    private final FoodDataRepository foodDataRepository;

    public FoodDataService(FoodDataRepository foodDataRepository) {
        this.foodDataRepository = foodDataRepository;
    }

    public List<FoodDataDto> deneme(String foodName) {
        List<FoodDataDto> foodDataDtoList = new ArrayList<>();
        foodDataRepository.findByFoodNameIgnoreCaseContaining(foodName).forEach(foodData -> {
            FoodDataDto foodDataDto = new FoodDataDto();
            entityToDto(foodData, foodDataDto);
            foodDataDtoList.add(foodDataDto);
        });
        return foodDataDtoList;
    }

    protected void entityToDto(FoodData foodData, FoodDataDto foodDataDto)
    {
        //foodDataDto.setId(foodData.getId());
        foodDataDto.setFoodName(foodData.getFoodName());
        foodDataDto.setCalorie(foodData.getCalorie());
    }

}
