package com.bcp.dto.single;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MoroccanAgencyDTO {
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