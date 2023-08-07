package com.bcp.service;

import com.bcp.model.City;

import java.util.List;

public interface CityService {
    City getCity(String cityCode);
    List<City> getCities();
    City createCity(City city);

//    void populate(List<City> cities);
}