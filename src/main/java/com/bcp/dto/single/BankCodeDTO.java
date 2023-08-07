package com.bcp.dto.single;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BankCodeDTO {
    private String name;
    private String code;
    private String address;
    private String country;
    private String swift;
}