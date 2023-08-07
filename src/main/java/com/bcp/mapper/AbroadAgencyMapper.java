package com.bcp.mapper;

import com.bcp.dto.list.AbroadAgenciesDTO;
import com.bcp.dto.single.AbroadAgencyDTO;
import com.bcp.model.AbroadAgency;

import java.util.List;
import java.util.stream.Collectors;


public class AbroadAgencyMapper {

    public static AbroadAgencyDTO toDTO(AbroadAgency entity) {
        return AbroadAgencyDTO
                .builder()
                .countryCode(entity.getCountryCode())
                .agencyCode(entity.getAgencyCode())
                .label(entity.getLabel())
                .longitude(entity.getLongitude())
                .latitude(entity.getLatitude())
                .address(entity.getAddress())
                .phoneNumber(entity.getPhoneNumber())
                .openSaturday(entity.isOpenSaturday())
                .cardImpression(entity.isCardImpression())
                .build();
    }

    public static AbroadAgenciesDTO toDTOs(List<AbroadAgency> agencies) {
        return AbroadAgenciesDTO.builder().agencies(agencies.stream().map(AbroadAgencyMapper::toDTO).collect(Collectors.toList())).build() ;
    }

    public static List<AbroadAgency> toEntities(List<AbroadAgencyDTO> abroadAgencyDTOS) {
        return abroadAgencyDTOS.stream().map(AbroadAgencyMapper::toEntity).collect(Collectors.toList());
    }

    public static AbroadAgency toEntity(AbroadAgencyDTO bcpAgency) {
        return AbroadAgency
                .builder()
                .countryCode(bcpAgency.getCountryCode())
                .agencyCode(bcpAgency.getAgencyCode())
                .label(bcpAgency.getLabel())
                .longitude(bcpAgency.getLongitude())
                .latitude(bcpAgency.getLatitude())
                .address(bcpAgency.getAddress())
                .phoneNumber(bcpAgency.getPhoneNumber())
                .openSaturday(bcpAgency.isOpenSaturday())
                .cardImpression(bcpAgency.isCardImpression())
                .build();
    }
}