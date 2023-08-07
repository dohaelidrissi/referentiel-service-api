package com.bcp.service;

import com.bcp.model.MoroccanAgency;

import java.util.List;

public interface MoroccanAgencyService {
    MoroccanAgency getMoroccanAgency(String agencyCode);

    List<MoroccanAgency> getMoroccanAgencies();

    MoroccanAgency createMoroccanAgency(MoroccanAgency agency);
}