package com.bcp.controller;

import com.bcp.dto.list.CityCodesDTO;
import com.bcp.dto.single.CityDTO;
import com.bcp.mapper.CityMapper;
import com.bcp.model.City;
import com.bcp.service.CityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/distribution/ref/cities")
public class CityController {
    private final CityService cityService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CityCodesDTO getCities() {
        return CityMapper.toDTOs(cityService.getCities());
    }

    @GetMapping("/{cityCode}")
    @ResponseStatus(HttpStatus.OK)
    public CityDTO getCity(@PathVariable String cityCode) {
        return CityMapper.toDTO(cityService.getCity(cityCode));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public City populate(@RequestBody CityDTO cityDTO) {
        return cityService.createCity(CityMapper.toEntity(cityDTO));
    }
}