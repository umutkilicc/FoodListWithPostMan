package com.foodList.foodList.Service.Impl;

import com.foodList.foodList.Dto.FoodDto;
import com.foodList.foodList.Dto.MainFoodDto;
import com.foodList.foodList.Entitiy.Food;
import com.foodList.foodList.Entitiy.MainFood;
import com.foodList.foodList.Repository.MainFoodRepository;
import com.foodList.foodList.Service.MainFoodService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainFoodServiceImpl implements MainFoodService {
    private final MainFoodRepository mainFoodRepository;

    public MainFoodServiceImpl(MainFoodRepository mainFoodRepository) {
        this.mainFoodRepository = mainFoodRepository;
    }

    @Override
    public List<MainFoodDto> getAll() {
        return null;
    }

    @Override
    public MainFoodDto add(MainFoodDto mainFoodDto) {
        MainFood mainFood = new MainFood();
        dtoToEntity(mainFoodDto, mainFood);
        mainFood = mainFoodRepository.save(mainFood);
        entityToDto(mainFood, mainFoodDto);
        return mainFoodDto;
    }

    protected void entityToDto(MainFood mainFood, MainFoodDto mainFoodDto)
    {
        mainFoodDto.setCity(mainFood.getCity());
    }
    protected void dtoToEntity(MainFoodDto mainFoodDto, MainFood mainFood)
    {
        mainFood.setCity(mainFoodDto.getCity());
    }
}
