package com.bcp.service;

import com.bcp.model.CountryCode;

import java.util.List;

public interface CountryCodeService {
    CountryCode getCountryCode(String code);
    List<CountryCode> getCountryCodes();
    CountryCode createCountryCode(CountryCode code);
}