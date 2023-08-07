package com.bcp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MoroccanAgency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cityCode;
    private String agencyCode;
    private String label;
    private String longitude;
    private String latitude;
    private String address;
    private String phoneNumber;
    private boolean openSaturday;
    private boolean cardImpression;
}