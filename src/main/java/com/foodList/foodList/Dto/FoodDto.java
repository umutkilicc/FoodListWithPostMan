package com.foodList.foodList.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodDto {

    private Integer id;
    private String soup;
    private String mainDish;
    private String optionalMainDish;
    private String sideDish;
    private String dessert;
    private String softDrinks;
    private String date;

}
