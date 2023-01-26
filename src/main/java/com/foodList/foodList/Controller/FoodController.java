package com.foodList.foodList.Controller;

import com.foodList.foodList.Dto.FoodDto;
import com.foodList.foodList.Service.Impl.FoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/food")
public class FoodController {
    @Autowired
    private final FoodServiceImpl foodServiceImpl;

    public FoodController(FoodServiceImpl foodServiceImpl) {
        this.foodServiceImpl = foodServiceImpl;
    }

    @GetMapping("/getall")
    public @ResponseBody List<FoodDto> getAll()
    {
        return foodServiceImpl.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.OK, reason = "Added completed")
    public FoodDto add(@RequestBody FoodDto foodDto) {
        return foodServiceImpl.add(foodDto);
    }

    @GetMapping("/test")
    @ResponseStatus(code = HttpStatus.OK, reason = "OK")
    public String ok()
    {
        return "Success";
    }
}
