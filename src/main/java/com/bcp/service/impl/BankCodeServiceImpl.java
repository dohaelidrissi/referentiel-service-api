package com.bcp.service.impl;

import com.bcp.exception.exceptions.NotFoundException;
import com.bcp.model.BankCode;
import com.bcp.repository.BankCodeRepository;
import com.bcp.service.BankCodeService;
import com.bcp.util.Constants.BaseResponseErrorMessages;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class BankCodeServiceImpl implements BankCodeService {

    private final BankCodeRepository bankCodeRepository;

    @Override
    public BankCode getBank(String code) {
        return Optional.ofNullable(bankCodeRepository.findByCode(code))
                .orElseThrow(() -> new NotFoundException(BaseResponseErrorMessages.getBankNotFound(code)));
    }

    @Override
    public List<BankCode> getBanks() {
        return bankCodeRepository.findAll();
    }

    @Override
    public BankCode createBankCode(BankCode bankCode) {
        return bankCodeRepository.save(bankCode);
    }
}