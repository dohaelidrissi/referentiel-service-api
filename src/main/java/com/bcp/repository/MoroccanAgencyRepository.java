package com.bcp.repository;

import com.bcp.model.MoroccanAgency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoroccanAgencyRepository extends JpaRepository<MoroccanAgency, Long> {
    MoroccanAgency findByAgencyCode(String agencyCode);
}