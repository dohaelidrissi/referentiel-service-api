package com.bcp.service;

import com.bcp.model.AbroadAgency;

import java.util.List;

public interface AbroadAgencyService {
    AbroadAgency getAbroadAgency(String agencyCode);

    List<AbroadAgency> getAbroadAgencies();

    AbroadAgency createAbroadAgency(AbroadAgency toEntity);
}