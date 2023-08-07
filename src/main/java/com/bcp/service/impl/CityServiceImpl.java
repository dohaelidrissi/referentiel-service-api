package com.bcp.service.impl;

import com.bcp.exception.exceptions.NotFoundException;
import com.bcp.model.City;
import com.bcp.repository.CityRepository;
import com.bcp.service.CityService;
import com.bcp.util.Constants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    @Override
    public City getCity(String cityCode) {
        return Optional.ofNullable(cityRepository.findByCityCode(cityCode))
                .orElseThrow(() -> new NotFoundException(Constants.BaseResponseErrorMessages.getCityNotFound(cityCode)));
    }

    @Override
    public List<City> getCities() {
        return cityRepository.findAll();
    }

    @Override
    public City createCity(City city) {
        return cityRepository.save(city);
    }
}