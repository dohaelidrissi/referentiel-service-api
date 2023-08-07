package com.bcp.service;

import com.bcp.model.BankCode;

import java.util.List;

public interface BankCodeService {
    BankCode getBank(String code);

    List<BankCode> getBanks();
    BankCode createBankCode(BankCode bankCode);
}