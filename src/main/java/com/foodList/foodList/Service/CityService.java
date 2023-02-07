package com.foodList.foodList.Service;

import com.foodList.foodList.Dto.CityDto;
import com.foodList.foodList.Dto.FoodDto;
import com.foodList.foodList.Entitiy.City;
import com.foodList.foodList.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {

    @Autowired
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<CityDto> getAllCity() {

        List<CityDto> cityDtoCityList = new ArrayList<>();
        cityRepository.findAll().forEach(city -> {
            CityDto cityDto = new CityDto();
            entityToDto(city, cityDto);
            dtoToEntity(cityDto, city);
            cityDtoCityList.add(cityDto);

        });
        return cityDtoCityList;
    }


    protected void entityToDto(City city, CityDto cityDto)
    {
        cityDto.setId(city.getId());
        cityDto.setCity(city.getCity());
    }

    protected void dtoToEntity(CityDto cityDto, City city)
    {
        city.setId(cityDto.getId());
        city.setCity(cityDto.getCity());
    }
}
