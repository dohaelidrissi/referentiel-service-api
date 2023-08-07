package com.bcp.controller;


import com.bcp.dto.list.AbroadAgenciesDTO;
import com.bcp.dto.single.AbroadAgencyDTO;
import com.bcp.mapper.AbroadAgencyMapper;
import com.bcp.model.AbroadAgency;
import com.bcp.service.AbroadAgencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/distribution/ref/abroadAgencies")
public class AbroadAgencyController {

    private final AbroadAgencyService abroadAgencyService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public AbroadAgenciesDTO getAbroadAgencies() {
        return AbroadAgencyMapper.toDTOs(abroadAgencyService.getAbroadAgencies());
    }

    @GetMapping("/{agencyCode}")
    @ResponseStatus(HttpStatus.OK)
    public AbroadAgencyDTO getAbroadAgency(@PathVariable String agencyCode) {
        return AbroadAgencyMapper.toDTO(abroadAgencyService.getAbroadAgency(agencyCode));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public AbroadAgency populate(@RequestBody AbroadAgencyDTO abroadAgencyDTO) {
        return abroadAgencyService.createAbroadAgency(AbroadAgencyMapper.toEntity(abroadAgencyDTO));
    }

}