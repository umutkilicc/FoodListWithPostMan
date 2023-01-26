package com.foodList.foodList.Service.Impl;

import com.foodList.foodList.Dto.FoodDto;
import com.foodList.foodList.Entitiy.Food;
import com.foodList.foodList.Repository.FoodRepository;
import com.foodList.foodList.Service.FoodService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class FoodServiceImpl implements FoodService {

    @Autowired
    private final FoodRepository foodRepository;

    public FoodServiceImpl(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }
    @Override
    public List<FoodDto> getAll() {

        List<FoodDto> foodDtoList = new ArrayList<>();
        foodRepository.findAll().forEach(food -> {
                FoodDto foodDto = new FoodDto();
                entityToDto(food, foodDto);
                dtoToEntity(foodDto, food);
                foodDtoList.add(foodDto);

        });
        return foodDtoList;
    }

    @Override
    public FoodDto add(FoodDto foodDto) {

        Food food = new Food();
        dtoToEntity(foodDto, food);
        food = foodRepository.save(food);
        entityToDto(food, foodDto);
        return foodDto;
    }

    protected void entityToDto(Food food, FoodDto foodDto)
    {
        foodDto.setId(food.getId());
        foodDto.setSoup(food.getSoup());
        foodDto.setMainDish(food.getMainDish());
        foodDto.setOptionalMainDish(food.getOptionalMainDish());
        foodDto.setSideDish(foodDto.getSideDish());
        foodDto.setDessert(food.getDessert());
        foodDto.setSoftDrinks(food.getSoftDrinks());
        foodDto.setDate(food.getDate());
    }
    protected void dtoToEntity(FoodDto foodDto, Food food)
    {
        food.setId(foodDto.getId());
        food.setSoup(foodDto.getSoup());
        food.setMainDish(foodDto.getMainDish());
        food.setOptionalMainDish(foodDto.getOptionalMainDish());
        food.setDessert(foodDto.getDessert());
        food.setSideDish(foodDto.getSideDish());
        food.setDessert(foodDto.getDessert());
        food.setSoftDrinks(foodDto.getSoftDrinks());
        food.setDate(foodDto.getDate());
    }
}
