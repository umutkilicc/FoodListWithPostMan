package com.foodList.foodList.Dto;

import com.foodList.foodList.Entitiy.Food;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityDto {

    private Long id;
    private String city;
}
