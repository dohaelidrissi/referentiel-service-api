package com.bcp.mapper;

import com.bcp.dto.list.MoroccanAgenciesDTO;
import com.bcp.dto.single.MoroccanAgencyDTO;
import com.bcp.model.MoroccanAgency;

import java.util.List;
import java.util.stream.Collectors;


public class MoroccanAgencyMapper {
    public static MoroccanAgencyDTO toDTO(MoroccanAgency bcpAgency) {
        return MoroccanAgencyDTO
                .builder()
                .cityCode(bcpAgency.getCityCode())
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

    public static MoroccanAgenciesDTO toDTOs(List<MoroccanAgency> agencies) {
        return MoroccanAgenciesDTO.builder().agencies(agencies.stream().map(MoroccanAgencyMapper::toDTO).collect(Collectors.toList())).build();
    }

    public static List<MoroccanAgency> toEntities(List<MoroccanAgencyDTO> agencies) {
        return agencies.stream().map(MoroccanAgencyMapper::toEntity).collect(Collectors.toList());
    }

    public static MoroccanAgency toEntity(MoroccanAgencyDTO bcpAgency) {
        return MoroccanAgency
                .builder()
                .cityCode(bcpAgency.getCityCode())
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