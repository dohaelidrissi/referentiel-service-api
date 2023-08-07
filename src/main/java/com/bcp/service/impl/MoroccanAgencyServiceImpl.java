package com.bcp.service.impl;

import com.bcp.exception.exceptions.NotFoundException;
import com.bcp.model.MoroccanAgency;
import com.bcp.repository.MoroccanAgencyRepository;
import com.bcp.service.MoroccanAgencyService;
import com.bcp.util.Constants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class MoroccanAgencyServiceImpl implements MoroccanAgencyService {

    private final MoroccanAgencyRepository moroccanAgencyRepository;

    @Override
    public MoroccanAgency getMoroccanAgency(String agencyCode) {
        return Optional.ofNullable(moroccanAgencyRepository.findByAgencyCode(agencyCode))
                .orElseThrow(() -> new NotFoundException(Constants.BaseResponseErrorMessages.getBcpAgencyNotFound(agencyCode)));
    }

    @Override
    public List<MoroccanAgency> getMoroccanAgencies() {
        return moroccanAgencyRepository.findAll();
    }

    @Override
    public MoroccanAgency createMoroccanAgency(MoroccanAgency agency) {
        return moroccanAgencyRepository.save(agency);
    }
}