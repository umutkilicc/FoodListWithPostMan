package com.foodList.foodList.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodDataDto {

    //private Long id;
    private String foodName;
    private Integer calorie;

}
