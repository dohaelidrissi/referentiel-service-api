package com.bcp.service.impl;

import com.bcp.exception.exceptions.NotFoundException;
import com.bcp.model.CountryCode;
import com.bcp.repository.CountryCodeRepository;
import com.bcp.service.CountryCodeService;
import com.bcp.util.Constants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class CountryCodeServiceImpl implements CountryCodeService {

    private final CountryCodeRepository countryCodeRepository;

    @Override
    public CountryCode getCountryCode(String code) {
        return Optional.ofNullable(countryCodeRepository.findByCode(code))
                .orElseThrow(() -> new NotFoundException(Constants.BaseResponseErrorMessages.getCountryCodeNotFound(code)));
    }

    @Override
    public List<CountryCode> getCountryCodes() {
        return countryCodeRepository.findAll();
    }

    @Override
    public CountryCode createCountryCode(CountryCode code) {
        return countryCodeRepository.save(code);
    }

}