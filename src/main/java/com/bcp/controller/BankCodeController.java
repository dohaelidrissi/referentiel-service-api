package com.bcp.controller;

import com.bcp.dto.list.BankCodesDTO;
import com.bcp.dto.single.BankCodeDTO;
import com.bcp.mapper.BankCodeMapper;
import com.bcp.model.BankCode;
import com.bcp.service.BankCodeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/distribution/ref/bankCodes")
public class BankCodeController {
    private final BankCodeService bankCodeService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public BankCodesDTO getBanks() {
        return BankCodeMapper.toDTOs(bankCodeService.getBanks());
    }

    @GetMapping("/{bankCode}")
    @ResponseStatus(HttpStatus.OK)
    public BankCodeDTO getBank(@PathVariable String bankCode) {
        return BankCodeMapper.toDTO(bankCodeService.getBank(bankCode));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public BankCode populate(@RequestBody BankCodeDTO bankCodeDTO) {
        return bankCodeService.createBankCode(BankCodeMapper.toEntity(bankCodeDTO));
    }

}