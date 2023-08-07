package com.bcp.controller;

import com.bcp.dto.list.MoroccanAgenciesDTO;
import com.bcp.dto.single.MoroccanAgencyDTO;
import com.bcp.mapper.MoroccanAgencyMapper;
import com.bcp.model.MoroccanAgency;
import com.bcp.service.MoroccanAgencyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/distribution/ref/moroccanAgencies")
public class MoroccanAgencyController {

    private final MoroccanAgencyService moroccanAgencyService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public MoroccanAgenciesDTO getMoroccanAgencies() {
        return MoroccanAgencyMapper.toDTOs(moroccanAgencyService.getMoroccanAgencies());
    }

    @GetMapping("/{agencyCode}")
    @ResponseStatus(HttpStatus.OK)
    public MoroccanAgencyDTO getBcpAgency(@PathVariable String agencyCode) {
        return MoroccanAgencyMapper.toDTO(moroccanAgencyService.getMoroccanAgency(agencyCode));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public MoroccanAgency populate(@RequestBody MoroccanAgencyDTO moroccanAgencyDTO) {
        return moroccanAgencyService.createMoroccanAgency(MoroccanAgencyMapper.toEntity(moroccanAgencyDTO));
    }
}