package com.foodList.foodList.Controller;

import com.foodList.foodList.Dto.FoodDto;
import com.foodList.foodList.Dto.MainFoodDto;
import com.foodList.foodList.Service.Impl.MainFoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/mainFood")
public class MainFoodController {

    @Autowired
    private final MainFoodServiceImpl mainFoodServiceImpl;

    public MainFoodController(MainFoodServiceImpl mainFoodServiceImpl) {
        this.mainFoodServiceImpl = mainFoodServiceImpl;
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.OK, reason = "Added completed")
    public MainFoodDto add(@RequestBody MainFoodDto mainFoodDto) {
        return mainFoodServiceImpl.add(mainFoodDto);
    }
}
