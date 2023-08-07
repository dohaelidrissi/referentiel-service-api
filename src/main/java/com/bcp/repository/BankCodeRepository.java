package com.bcp.repository;

import com.bcp.model.BankCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankCodeRepository extends JpaRepository<BankCode, Long> {
    BankCode findByCode(String bankCode);
}