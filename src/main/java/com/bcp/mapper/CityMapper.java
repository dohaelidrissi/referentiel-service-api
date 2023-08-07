package com.bcp.mapper;

import com.bcp.dto.list.CityCodesDTO;
import com.bcp.dto.single.CityDTO;
import com.bcp.model.City;

import java.util.List;
import java.util.stream.Collectors;


public class CityMapper {
    public static CityDTO toDTO(City entity) {
        return CityDTO
                .builder()
                .cityCode(entity.getCityCode())
                .cityName(entity.getCityName())
                .build();
    }

    public static City toEntity(CityDTO dto) {
        return City
                .builder()
                .cityCode(dto.getCityCode())
                .cityName(dto.getCityName())
                .build();
    }

    public static CityCodesDTO toDTOs(List<City> cities) {
        return CityCodesDTO.builder().cityCodes(cities.stream().map(CityMapper::toDTO).collect(Collectors.toList())).build();
    }

    public static List<City> toEntities(List<CityDTO> cities) {
        return cities.stream().map(CityMapper::toEntity).collect(Collectors.toList());
    }
}