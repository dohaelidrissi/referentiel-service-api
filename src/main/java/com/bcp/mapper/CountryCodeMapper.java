package com.bcp.mapper;

import com.bcp.dto.list.CountryCodesDTO;
import com.bcp.dto.single.CountryCodeDTO;
import com.bcp.model.CountryCode;

import java.util.List;
import java.util.stream.Collectors;


public class CountryCodeMapper {

    public static CountryCodeDTO toDTO(CountryCode entity) {
        return CountryCodeDTO
                .builder()
                .name(entity.getName())
                .dialCode(entity.getDialCode())
                .code(entity.getCode())
                .build();
    }

    public static CountryCode toEntity(CountryCodeDTO dto) {
        return CountryCode
                .builder()
                .name(dto.getName())
                .dialCode(dto.getDialCode())
                .code(dto.getCode())
                .build();
    }

    public static CountryCodesDTO toDTOs(List<CountryCode> request) {
        return CountryCodesDTO.builder().countryCodes(request.stream().map(CountryCodeMapper::toDTO).collect(Collectors.toList())).build();
    }

    public static List<CountryCode> toEntities(List<CountryCodeDTO> countries) {
        return countries.stream().map(CountryCodeMapper::toEntity).collect(Collectors.toList());
    }
}