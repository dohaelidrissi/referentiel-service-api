package com.bcp.dto.single;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CountryCodeDTO {
    private String name;
    private String dialCode;
    private String code;
}