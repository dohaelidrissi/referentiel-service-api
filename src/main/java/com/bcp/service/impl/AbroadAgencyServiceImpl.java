package com.bcp.service.impl;

import com.bcp.exception.exceptions.NotFoundException;
import com.bcp.model.AbroadAgency;
import com.bcp.repository.AbroadAgencyRepository;
import com.bcp.service.AbroadAgencyService;
import com.bcp.util.Constants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class AbroadAgencyServiceImpl implements AbroadAgencyService {

    private final AbroadAgencyRepository abroadAgencyRepository;

    @Override
    public AbroadAgency getAbroadAgency(String agencyCode) {
        System.out.println("hhhhhhhhhhh");
        return Optional.ofNullable(abroadAgencyRepository.findByAgencyCode(agencyCode))
                .orElseThrow(() -> new NotFoundException(Constants.BaseResponseErrorMessages.getBcpAgencyNotFound(agencyCode)));
    }

    @Override
    public List<AbroadAgency> getAbroadAgencies() {
        return abroadAgencyRepository.findAll();
    }

    @Override
    public AbroadAgency createAbroadAgency(AbroadAgency toEntity) {
        return abroadAgencyRepository.save(toEntity);
    }
}