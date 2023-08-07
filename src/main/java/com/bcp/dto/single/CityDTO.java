package com.bcp.dto.single;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CityDTO {
    private String cityCode;
    private String cityName;
}