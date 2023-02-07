package com.foodList.foodList.Controller;

import com.foodList.foodList.Dto.CityDto;
import com.foodList.foodList.Dto.FoodDto;
import com.foodList.foodList.Repository.CityRepository;
import com.foodList.foodList.Service.CityService;
import com.foodList.foodList.Service.Impl.FoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("api/food")
public class FoodController {
    @Autowired
    private final FoodServiceImpl foodServiceImpl;
    private final CityRepository cityRepository;
    @Autowired
    private final CityService cityService;

    public FoodController(FoodServiceImpl foodServiceImpl,
                          CityRepository cityRepository, CityService cityService) {
        this.foodServiceImpl = foodServiceImpl;
        this.cityRepository = cityRepository;
        this.cityService = cityService;
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
    public @ResponseBody String ok()
    {
        return "Success";
    }

    @GetMapping("/city")
    public @ResponseBody List<CityDto> getAllCity()
    {
        return cityService.getAllCity();
    }

    @GetMapping("/city/{city}")
    public @ResponseBody List<Object> getFoodCity(@PathVariable String city)
    {
        Object deneme = new Object();
        deneme = city;
        List<Object> denemeler = new ArrayList<Object>();
        denemeler.add(deneme);
        denemeler.add(foodServiceImpl.getFoodCity(city));
        return denemeler;
        /*
        return foodServiceImpl.getFoodCity(city);
         */
    }

    @GetMapping("/city/{city}/{startDate}/{endDate}")
    public @ResponseBody List<FoodDto> getDatesFood(@PathVariable("city") String city, @PathVariable("startDate") String startDate, @PathVariable("endDate") String endDate)
    {
        return foodServiceImpl.getDatesFood(city, startDate, endDate);
    }
}
