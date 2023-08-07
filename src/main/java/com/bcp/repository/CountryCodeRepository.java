package com.bcp.repository;

import com.bcp.model.CountryCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryCodeRepository extends JpaRepository<CountryCode, Long> {
    CountryCode findByCode(String code);
}