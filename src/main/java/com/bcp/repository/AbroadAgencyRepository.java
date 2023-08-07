package com.bcp.repository;

import com.bcp.model.AbroadAgency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbroadAgencyRepository extends JpaRepository<AbroadAgency, Long> {
    AbroadAgency findByAgencyCode(String agencyCode);
}