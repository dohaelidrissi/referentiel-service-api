package com.bcp.controller;

import com.bcp.dto.list.CountryCodesDTO;
import com.bcp.dto.single.CountryCodeDTO;
import com.bcp.mapper.CountryCodeMapper;
import com.bcp.model.CountryCode;
import com.bcp.service.CountryCodeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/distribution/ref/countryCodes")
public class CountryCodeController {
    private final CountryCodeService countryCodeService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CountryCodesDTO getCountryCodes() {
        return CountryCodeMapper.toDTOs(countryCodeService.getCountryCodes());
    }

    @GetMapping("/{code}")
    @ResponseStatus(HttpStatus.OK)
    public CountryCodeDTO getCountryCode(@PathVariable String code) {
        return CountryCodeMapper.toDTO(countryCodeService.getCountryCode(code));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public CountryCode populate(@RequestBody CountryCodeDTO countryCodeDTO) {
        return countryCodeService.createCountryCode(CountryCodeMapper.toEntity(countryCodeDTO));
    }

}