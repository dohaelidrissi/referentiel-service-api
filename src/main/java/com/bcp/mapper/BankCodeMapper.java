package com.bcp.mapper;

import com.bcp.dto.list.BankCodesDTO;
import com.bcp.dto.single.BankCodeDTO;
import com.bcp.model.BankCode;

import java.util.List;
import java.util.stream.Collectors;

public class BankCodeMapper {


    public static BankCodeDTO toDTO(BankCode bank) {
        return BankCodeDTO
                .builder()
                .name(bank.getName())
                .code(bank.getCode())
                .address(bank.getAddress())
                .country(bank.getCountry())
                .swift(bank.getSwift())
                .build();
    }

    public static BankCodesDTO toDTOs(List<BankCode> list) {
        return BankCodesDTO.builder()
                .banks(list.stream().map(BankCodeMapper::toDTO).collect(Collectors.toList()))
                .build();
    }

    public static BankCode toEntity(BankCodeDTO bankCodeDTO) {
        return BankCode.builder()
                .name(bankCodeDTO.getName())
                .code(bankCodeDTO.getCode())
                .address(bankCodeDTO.getAddress())
                .country(bankCodeDTO.getCountry())
                .swift(bankCodeDTO.getSwift())
                .build();
    }
}